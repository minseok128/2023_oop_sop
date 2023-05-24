package _20230524_sop;

import java.util.Scanner;

public class Gym {
	private SoccerPlayer[] sc;
	private BasketBallPlayer[] bsk;
	private Scanner scanner = new Scanner(System.in);
	private static int playerLength = 16;

	Gym() {
		sc = new SoccerPlayer[playerLength];
		bsk = new BasketBallPlayer[playerLength];
	}

	private void reserve() {

	}

	private void search() {

	}

	private void cancel() {

	}

	private void quit() {
		System.out.println("Thank you");
	}

	public void run() {
		System.out.println("this is reservation system for gym.\n");
		int state;

		while (true) {
			System.out.println("Reserve: 1, Search: 2, Cancel: 3, Quit: 4 >> ");
			state = scanner.nextInt();
			switch (state) {
				case 1:
					reserve();
					break;
				case 2:
					search();
					break;
				case 3:
					cancel();
					break;
				case 4:
					quit();
					return;
				default:
					System.out.println("This is a wrong command.");
					break;
			}
			System.out.println();
		}

	}
}
