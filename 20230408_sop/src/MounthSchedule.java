import java.util.Scanner;

public class MounthSchedule {
	Day days[];
	Scanner sc = new Scanner(System.in);

	public MounthSchedule() {
	}

	public MounthSchedule(int n) {
		days = new Day[n];
		for (int i = 0; i < n; i++)
			days[i] = new Day();
	}

	public void run() {
		int command;

		System.out.println("This is schedule management program for this mounth.");
		while (true) {
			System.out.print("\nCommand(Insert: 1, Show: 2, Quit: 3)>> ");
			command = sc.nextInt();
			if (command == 1)
				input();
			else if (command == 2)
				view();
			else if (command == 3) {
				finish();
				break;
			}
		}
	}

	void input() {
		int newDay;
		System.out.print("Date(1-" + this.days.length + ")? ");
		newDay = sc.nextInt();
		if (newDay >= 1 && newDay <= this.days.length) {
			System.out.print("Do list (without space)? ");
			this.days[newDay - 1].set(sc.next());
		}
	}

	void view() {
		int newDay;
		System.out.print("Date(1-" + this.days.length + ")? ");
		newDay = sc.nextInt();
		if (newDay >= 1 && newDay <= this.days.length) {
			this.days[newDay - 1].show();
			System.out.println(" on " + newDay
					+ (newDay == 1 ? "st" : newDay == 2 ? "nd" : newDay == 3 ? "rd" : "th") + ".");
		}
	}

	void finish() {
		System.out.println("This is the end of the program.");
		sc.close();
	}
}