import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = (int) (Math.random() * 10 + 1);
			}
		}
		for (int i = 0; i < 6;) {
			int new_idx = (int) (Math.random() * 16);
			if (arr[new_idx / 4][new_idx % 4] != 0) {
				arr[new_idx / 4][new_idx % 4] = 0;
				i++;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				System.out.printf("%2d ", arr[i][j]);
			System.out.print('\n');
		}
		sc.close();
	}
}
