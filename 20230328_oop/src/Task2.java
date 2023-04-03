import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input 10 positive integers >> ");
		int arr[] = new int[10];
		String result = "Multiples of 3 are";
		for (int i = 0; i < 10; i++) {
			int tmp = sc.nextInt();
			arr[i] = tmp;
			if (tmp % 3 == 0)
				result = result + " " + tmp;
		}
		System.out.println(result);
		sc.close();
	}
}
