import java.util.Scanner;

public class _task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, min, max, user;

		while (true) {
			num = (int) (Math.random() * 99);
			min = 0;
			max = 99;
			System.out.println("Card determined. Guess the number!");

			for (int i = 1;; i++) {
				System.out.print(min + " - " + max + '\n' + i + " >> ");
				user = sc.nextInt();
				if (user > num) {
					System.out.println("Lower");
					max = user < max ? user : max;
				} else if (user < num) {
					System.out.println("Higher");
					min = user > min ? user : min;
				} else {
					System.out.println("Correct!");
					break;
				}
			}

			System.out.print("Wanna play again? (y/n) >> ");
			if (sc.next().equals("n"))
				break;
		}
		sc.close();
	}
}
