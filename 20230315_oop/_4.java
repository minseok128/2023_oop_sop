import java.util.*;

public class _4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input coordinate of point(x,y) >> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x >= 100 && x <= 200 && y >= 100 && y <= 200)
			System.out.println("(" + x + "," + y + ") is inside the rectangle.");
		else
			System.out.println("(" + x + "," + y + ") is outside the rectangle.");
		sc.close();
	}
}
