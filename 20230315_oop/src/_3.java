import java.util.*;

public class _3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input inter between 1 ~ 99 >> ");
		int input = sc.nextInt();
		if ((input % 10) % 3 == 0 && (input / 10) % 3 == 0)
			System.out.println("clap clap");
		else if ((input % 10) % 3 == 0 || (input / 10) % 3 == 0)
			System.out.println("clap");
		sc.close();
	}
}
