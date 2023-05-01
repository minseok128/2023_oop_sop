import java.util.*;

public class _6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input center and radius of first circle >> ");
		double fx = sc.nextDouble();
		double fy = sc.nextDouble();
		double fr = sc.nextDouble();
		System.out.print("Input center and radius of second circle >> ");
		double sx = sc.nextDouble();
		double sy = sc.nextDouble();
		double sr = sc.nextDouble();
		if ((fx - sx) * (fx - sx) + (fy - sy) * (fy - sy) <= (fr + sr) * (fr + sr))
			System.out.println("They overlap");
		else
			System.out.println("They seperate");
		sc.close();
	}
}
