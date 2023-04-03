import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		String course[] = { "Java", "Python", "C++", "Calculus", "AI" };
		int score[] = { 95, 88, 76, 62, 100 };

		Scanner sc = new Scanner(System.in);
		String str = "";
		int i;
		while (true) {
			System.out.print("Subject Name >> ");
			str = sc.next();
			if (str.equals("Stop"))
				break;
			for (i = 0; i < course.length; i++) {
				if (course[i].equals(str)) {
					System.out.println(score[i]);
					break;
				}
			}
			if (i == course.length)
				System.out.println("No such subject");
		}
		sc.close();
	}
}
