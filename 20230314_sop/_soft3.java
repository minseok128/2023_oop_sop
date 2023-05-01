import java.util.*;

public class _soft3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		if (arr[0] + arr[1] > arr[2])
			System.out.println("these lines can construct triangle.");
		else
			System.out.println("these lines cannot construct triangle.");
		sc.close();
	}
}
