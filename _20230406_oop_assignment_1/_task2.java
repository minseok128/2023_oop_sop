import java.util.Scanner;

public class _task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String james, tom, winner = "Tom";

		System.out.print("Jamse >> ");
		james = sc.next().toLowerCase();
		System.out.print("Tom >> ");
		tom = sc.next().toLowerCase();

		if (james.equals(tom))
			System.out.println("End in a tie.");
		else {
			if ((james.equals("rock") && tom.equals("scissor"))
					|| (james.equals("scissor") && tom.equals("paper"))
					|| (james.equals("paper") && tom.equals("rock")))
				winner = "James";
			System.out.println(winner + " is winner.");
		}
		sc.close();
	}
}
