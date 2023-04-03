import java.util.Scanner;
import java.util.Arrays;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int check[] = new int[101];

		System.out.print("Size of array >> ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			int new_i = (int) (Math.random() * 100 + 1);
			if (check[new_i] == 0) {
				arr[i] = new_i;
				check[new_i] = 1;
			} else
				i--;
		}
		System.out.println(
				Arrays.toString(arr).substring(1, Arrays.toString(arr).length() - 1).replace(",", ""));
		sc.close();
	}
}
