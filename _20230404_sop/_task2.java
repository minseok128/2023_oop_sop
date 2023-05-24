import java.util.*;

public class _task2 {
	public static void main(String[] av) {
		Scanner sc = new Scanner(System.in);
		String s = "0";
		for (int n = sc.nextInt(); n >= 0; s = (char) (s.charAt(0) + 1) + s + (char) (s.charAt(0) + 1))
			System.out.println(" ".repeat(n--) + s);
		sc.close();
	}
}
