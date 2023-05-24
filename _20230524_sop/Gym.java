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
		System.out.print("Soccer: 1, BasketBall: 2 >> ");
		int type = scanner.nextInt();
		System.out.print("Name >> ");
		String name = scanner.next();
		System.out.print("Room number >> ");
		int roomNumber = scanner.nextInt();
		if (type == 1)
			sc[roomNumber - 1] = new SoccerPlayer(name, 0.0);
		else if (type == 2)
			bsk[roomNumber - 1] = new BasketBallPlayer(name);
		else
			System.out.println("This is a wrong command.");
	}

	private void search() {
		System.out.print("Soccer: 1, BasketBall: 2 >> ");
		int type = scanner.nextInt();
		System.out.print("Room number >> ");
		int roomNumber = scanner.nextInt();
		if (type == 1)
		{
			if (sc[roomNumber - 1] != null)
				sc[roomNumber - 1].showDetail();
			else
				System.out.println("This room is empty.");
		}
		else if (type == 2)
		{
			if (bsk[roomNumber - 1] != null)
				bsk[roomNumber - 1].showDetail();
			else
				System.out.println("This room is empty.");
		}
		else
			System.out.println("This is a wrong command.");
	}

	private void cancel() {
		System.out.print("Soccer: 1, BasketBall: 2 >> ");
		int type = scanner.nextInt();
		System.out.print("Name >> ");
		String name = scanner.next();
		int i = 0;
		if (type == 1)
		{
			for (; i < playerLength; i++)
				if (sc[i] != null && sc[i].getName().equals(name))
				{
					sc[i] = null;
					break;
				}
			if (i == playerLength)
				System.out.println("This is a wrong name.");
		}
		else if (type == 2)
		{
			for (; i < playerLength; i++)
				if (bsk[i] != null && bsk[i].getName().equals(name))
				{
					bsk[i] = null;
					break;
				}
			if (i == playerLength)
				System.out.println("This is a wrong name.");
		}
		else
			System.out.println("This is a wrong command.");
	}

	private void quit() {
		System.out.println("Thank you");
	}

	public void run() {
		System.out.println("this is reservation system for gym.\n");
		int state;

		while (true) {
			System.out.print("Reserve: 1, Search: 2, Cancel: 3, Quit: 4 >> ");
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
