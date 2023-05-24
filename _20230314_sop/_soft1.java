import java.util.*;

public class _soft1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
		double y = sc.nextInt();
		double r = sc.nextInt();
		double a = sc.nextInt();
		double b = sc.nextInt();

		if ((x - a) * (x - a) + (y - b) * (y - b) <= r * r) {
			System.out.println("this is in the circle");
		} else
			System.out.println("this is not in the circle");
		sc.close();
	}
}
