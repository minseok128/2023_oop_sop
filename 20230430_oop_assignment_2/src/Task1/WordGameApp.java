package Task1;

import java.util.Scanner;

public class WordGameApp {
    public static void main(String[] args) throws Exception {
        run();
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int playerNum;
        Player[] playerArr;
        String recentWord = "father", nextWord;

        System.out.print("Starting Word Relay Game...\nHow many player? >> ");
        playerNum = sc.nextInt();
        playerArr = new Player[playerNum];
        for (int i = 0; i < playerNum; i++) {
            System.out.print("Enter the name of player >> ");
            playerArr[i] = new Player(sc.next());
        }

        System.out.println("Starting word is \"" + recentWord + "\"");
        for (int i = 0;; i %= playerNum) {
            nextWord = playerArr[i].getWordFromUser(sc);
            if (!playerArr[i++].checkSuccess(recentWord, nextWord))
                break;
            recentWord = nextWord;
        }
        sc.close();
    }
}