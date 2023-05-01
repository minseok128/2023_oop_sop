package Task3;

import java.util.Scanner;

public class ReservationSystem {
	static Line[] arr;
	static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
		arr = new Line[3];
		arr[0] = new Line("S");
		arr[1] = new Line("A");
		arr[2] = new Line("B");
	}

	public static void main(String args[]) {
		int c;

		System.out.println("Reservation system for OOP concert.");
		do {
			try {
				System.out.print("Reserve: 1, Lookup: 2, Cancel: 3, Exit: 4 >> ");
				c = sc.nextInt();
			} catch (Exception e) {
				c = 5;
				sc.nextLine();
			}
		} while (c == 1 ? reserve() : c == 2 ? lookup() : c == 3 ? cancel() : c == 4 ? exit() : error(3));
	}

	static boolean reserve() {
		int row, col;
		String newName;

		try {
			System.out.print("Seat Type S(1), A(2), B(3) >> ");
			row = sc.nextInt() - 1;
			if (row < 0 || row > 2)
				return (error(2));

			arr[row].show();		
			System.out.print("Name >> ");
			newName = sc.next();
			System.out.print("Seat Number >> ");
			col = sc.nextInt() - 1;
			return(error(arr[row].reserve(col, newName)));
		} catch (Exception e) {
			sc.nextLine();
			return (error(2));
		}
	}

	static boolean lookup() {
		for (Line l : arr)
			l.show();
		System.out.println("<<Lookup Complete>>");
		return (true);
	}

	static boolean cancel() {
		int row;

		try {
			System.out.print("Seat Type S(1), A(2), B(3) >> ");
			row = sc.nextInt() - 1;
			if (row < 0 || row > 2)
				return (error(2));

			arr[row].show();
			System.out.print("Name >> ");
			return(error(arr[row].cancel(sc.next())));
		} catch (Exception e) {
			sc.nextLine();
			return (error(2));
		}
	}

	static boolean exit() {
		sc.close();
		return (false);
	}

	static boolean error(int errno) {
		if (errno == 1)
			System.out.println("!!Wrong name!!");
		else if (errno == 2)
			System.out.println("!!Wrong number!!");
		else if (errno == 3)
			System.out.println("!!Wrong menus!!");
		else if (errno == 4)
			System.out.println("!!Incorrect cancellations!!");
		else if (errno == 5)
			System.out.println("!!Already reservated!!");
		return (true);
	}
}