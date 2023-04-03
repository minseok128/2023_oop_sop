import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 100; i++) {
			if ((i / 10) % 3 == 0 && (i % 10) % 3 == 0 && (i % 10) != 0)
				System.out.println(i + " Clap Clap!");
			else if ((i / 10) % 3 == 0 || (i % 10) % 3 == 0 && (i % 10) != 0)
				System.out.println(i + " Clap!");
		}
		sc.close();
	}
}
