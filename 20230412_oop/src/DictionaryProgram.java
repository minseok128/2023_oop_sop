import java.util.Scanner;

class Dictionary {
	private static String[] kr = { "»ç¶û", "¹Ì·¡", "Èñ¸Á", "°øºÎ" };
	private static String[] en = { "love", "future", "hope", "study" };

	public static String kor2Eng(String word) {
		for (int i = 0; i < kr.length; i++) {
			if (kr[i].equals(word))
				return (en[i]);
		}
		return (null);
	}
}

public class DictionaryProgram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String kr, en;

		System.out.println("This is program for Kor-Eng Dictionary");
		while (true) {
			System.out.print("Korean word>> ");
			kr = sc.next();
			if (kr.equals("Stop"))
				break;
			en = Dictionary.kor2Eng(kr);
			if (en != null)
				System.out.println(kr + " is " + en);
			else
				System.out.println(kr + " is not in my dictionary");
		}
		sc.close();
	}
}
