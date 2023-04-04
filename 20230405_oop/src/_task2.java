import java.util.Scanner;

public class _task2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter scores for calculus, oop and introAI >> ");
		int calculus = sc.nextInt();
		int oop = sc.nextInt();
		int introAI = sc.nextInt();
		Grade my = new Grade(calculus, oop, introAI);
		System.out.println("Average is " + my.everage());
		sc.close();
	}
}

class Grade {
	private int calculus;
	private int oop;
	private int introAI;

	public Grade() {
		this(0, 0, 0);
	}

	public Grade(int calculus, int oop, int introAI) {
		this.calculus = calculus;
		this.oop = oop;
		this.introAI = introAI;
	}

	public int everage() {
		return ((calculus + oop + introAI) / 3);
	}
}