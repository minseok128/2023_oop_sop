import java.util.*;

public class _7_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Expression >> ");
		double a = sc.nextDouble();
		String op = sc.next();
		double b = sc.nextDouble();
		double result = 0;
		if (op.equals("+"))
			result = a + b;
		else if (op.equals("-"))
			result = a - b;
		else if (op.equals("*"))
			result = a * b;
		else if (op.equals("/")) {
			if (b == 0) {
				System.out.println("Cannot divide by 0");
				sc.close();
				return;
			} else
				result = a / b;
		}
		System.out.printf("Result of %.0f%s%.0f is %.0f\n", a, op, b, result);
		sc.close();
	}
}
