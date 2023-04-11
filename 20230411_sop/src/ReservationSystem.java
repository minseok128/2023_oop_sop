import java.util.Scanner;
import java.util.InputMismatchException;

public class ReservationSystem {
	String[][] arr = new String[3][16];
	Scanner sc = new Scanner(System.in);

	ReservationSystem() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 16; j++)
				arr[i][j] = new String("---");
	}

	void run() {
		int c;

		System.out.println("This is a reservation system for music concert.");
		do {
			try {
				System.out.print("\nReserve: 1, Search: 2, Cancel: 3, Quit: 4 >> ");
				c = sc.nextInt();
			} catch (InputMismatchException e) {
				c = 5;
				sc.nextLine();
			}
		} while (c == 1 ? reserve() : c == 2 ? search() : c == 3 ? cancel() : c == 4 ? quit() : error(1));
	}

	boolean reserve() {
		int row, col;
		String newName;

		try {
			System.out.print("Seat Type S(1), A(2), B(3) >> ");
			row = sc.nextInt();
			if (row < 1 || row > 3)
				return (error(4));
		} catch (InputMismatchException e) {
			sc.nextLine();
			return (error(1));
		}

		System.out.print((row == 1 ? 'S' : row == 2 ? 'A' : 'B') + ">> ");
		for (int i = 0; i < 16; i++)
			System.out.print(arr[row - 1][i] + " ");

		System.out.print("\nName >> ");
		newName = sc.next();
		try {
			System.out.print("Seat Number >> ");
			col = sc.nextInt();
			if (col < 1 || col > 16)
				return (error(4));
			else if (this.arr[row - 1][col - 1].equals("---"))
				this.arr[row - 1][col - 1] = newName;
			else
				return (error(2));
		} catch (InputMismatchException e) {
			sc.nextLine();
			return (error(1));
		}
		return (true);
	}

	boolean search() {
		for (int i = 0; i < 3; i++) {
			System.out.print((i == 0 ? 'S' : i == 1 ? 'A' : 'B') + ">> ");
			for (int j = 0; j < 16; j++)
				System.out.print(arr[i][j] + (j == 15 ? '\n' : ' '));
		}
		System.out.println("this is the end of the search.");
		return (true);
	}

	boolean cancel() {
		int row;
		String newName;

		try {
			System.out.print("Seat Type S(1), A(2), B(3) >> ");
			row = sc.nextInt();
			if (row < 1 || row > 3)
				return (error(4));
		} catch (InputMismatchException e) {
			sc.nextLine();
			return (error(1));
		}

		System.out.print((row == 1 ? 'S' : row == 2 ? 'A' : 'B') + ">> ");
		for (int i = 0; i < 16; i++)
			System.out.print(arr[row - 1][i] + " ");

		System.out.print("\nName >> ");
		newName = sc.next();
		for (int i = 0; i < 16; i++) {
			if (arr[row - 1][i].equals(newName)) {
				arr[row - 1][i] = "---";
				return (true);
			}
		}
		return (error(3));
	}

	boolean quit() {
		System.out.println("Thank you!");
		sc.close();
		return (false);
	}

	boolean error(int errno) {
		if (errno == 1)
			System.out.println("input error.");
		else if (errno == 2)
			System.out.println("already reserved.");
		else if (errno == 3)
			System.out.println("wrong name.");
		else if (errno == 4)
			System.out.println("out of range.");
		return (true);
	}
}