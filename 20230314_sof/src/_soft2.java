import java.util.*;

public class _soft2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int _50000 = money / 50000;
		money %= 50000;
		int _10000 = money / 10000;
		money %= 10000;
		int _1000 = money / 1000;
		money %= 1000;
		int _500 = money / 500;
		money %= 500;
		int _100 = money / 100;
		money %= 100;
		int _50 = money / 50;
		money %= 50;
		int _10 = money / 10;
		money %= 10;
		int _1 = money / 1;
		System.out.println("50000won : " + _50000);
		System.out.println("10000won : " + _10000);
		System.out.println("1000won : " + _1000);
		System.out.println("500won : " + _500);
		System.out.println("100won : " + _100);
		System.out.println("50won : " + _50);
		System.out.println("10won : " + _10);
		System.out.println("1won : " + _1);

		sc.close();
	}
}
