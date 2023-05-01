import java.util.Scanner;

public class Task2_20203361 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strArr[];

		strArr = sc.nextLine().split(",");
		for (String str : strArr) {
			System.out.print(str + ": ");
			if (str.contains("java"))
				System.out.println("true, " + str.replace("java", "python"));
			else
				System.out.println("false");
		}
		sc.close();
	}
}
