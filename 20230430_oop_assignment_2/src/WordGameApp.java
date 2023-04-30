import java.util.Scanner;

import javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon;

public class WordGameApp {
    public static void main(String[] args) throws Exception {
        run();
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int playerNum;
        Player[] playerArr;
        String recentWord = "father", nextWord;

        System.out.println("Starting Word Relay Game");
        System.out.print("How many player? >> ");
        playerNum = sc.nextInt();
        playerArr = new Player[playerNum];
        for (int i = 0; i < playerNum; i++) {
            System.out.print("Enter the name of player >> ");
            playerArr[i] = new Player(sc.next());
        }

        System.out.println("Starting word is \"" + recentWord + "\"");
        for (int i = 0;; i++) {
            System.out.print(playerArr[i % playerNum].name + " >> ");
            nextWord = sc.next();
            if (nextWord.charAt(nextWord.length() - 1) != recentWord.charAt(recentWord.length() - 1)) {
                System.out.println(playerArr[i % playerNum].name + " lose the game.");
                break;
            }
        }
        sc.close();
    }
}

class Player {
    String name;

    Player(String name) {
        this.name = name;
    }
}