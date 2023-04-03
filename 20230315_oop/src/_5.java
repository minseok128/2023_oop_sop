import java.util.*;

public class _5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input center and radius of circle >> ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double r = sc.nextDouble();
		System.out.print("Input point >> ");
		double ix = sc.nextDouble();
		double iy = sc.nextDouble();
		if ((x - ix) * (x - ix) + (y - iy) * (y - iy) <= r * r)
			System.out.println("Point (" + ix + "," + iy + ") is inside the circle.");
		else
			System.out.println("Point (" + ix + "," + iy + ") is outside the circle.");
		sc.close();
	}
}
