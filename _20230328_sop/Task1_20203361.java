import java.util.Scanner;

public class Task1_20203361 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		String strArr[] = str.split(" ");
		int size = strArr.length;
		double arr[] = new double[size];

		double sum = 0, mean, variance;
		for (int i = 0; i < size; i++) {
			arr[i] = Double.parseDouble(strArr[i]);
			sum += arr[i];
		}
		mean = sum / size;
		System.out.println("Mean:" + mean);
		sum = 0;
		for (int i = 0; i < size; i++)
			sum += (arr[i] - mean) * (arr[i] - mean);
		variance = sum / size;
		System.out.println("Variance" + variance);
		sc.close();
	}
}
