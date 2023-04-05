import java.util.Scanner;

public class _task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = "", com, winner;
		String comArr[] = { "Rock", "Paper", "Scissor" };

		while (true) {
			winner = "Computer";
			while (true) {
				System.out.print("Rock Paper Scissor! >> ");
				user = sc.next();
				if (user.equals("Rock") || user.equals("Scissor") || user.equals("Paper") || user.equals("stop"))
					break;
				System.out.println("Wrong Number");
			}
			if (user.equals("stop"))
				break;
			com = comArr[(int) (Math.random() * 3)];

			System.out.print("User = " + user + " , Computer = " + com + " , ");
			if (user.equals(com))
				System.out.println("Draw!");
			else {
				if ((user.equals("Rock") && com.equals("Scissor"))
						|| (user.equals("Scissor") && com.equals("Paper"))
						|| (user.equals("Paper") && com.equals("Rock")))
					winner = "User";
				System.out.println(winner + " win!");
			}
		}
		System.out.println("Terminating the game...");
		sc.close();
	}
}
