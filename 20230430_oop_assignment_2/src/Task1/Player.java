package Task1;

import java.util.Scanner;

class Player {
	private String name;

	Player(String name) {
		this.name = name;
	}

	String getWordFromUser(Scanner sc) {
		System.out.print(this.name + " >> ");
		return (sc.next());
	}

	boolean checkSuccess(String recentWord, String nextWord) {
		if (nextWord.charAt(0) != recentWord.charAt(recentWord.length() - 1)) {
			System.out.println(this.name + " lose the game.");
			return (false);
		}
		return (true);
	}
}