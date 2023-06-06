import java.util.Vector;
import java.util.Scanner;
import java.util.Random;

public class WordQuiz {
	public static void main(String[] args)
	{
		var sc = new Scanner(System.in);
		var rand = new Random();
		var select_vec = new Vector<Integer>();
		var v = new Vector<Word>();
		int correct, select;
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("error", "오류"));
		v.add(new Word("painting", "그림"));
		v.add(new Word("social", "사회"));
		v.add(new Word("picture", "사진"));
		v.add(new Word("apple", "사과"));
		v.add(new Word("banana", "바나나"));
		v.add(new Word("cherry", "체리"));
		v.add(new Word("orange", "오렌지"));
		v.add(new Word("watermelon", "수박"));
		v.add(new Word("grape", "포도"));
		v.add(new Word("strawberry", "딸기"));

		System.out.println("Start English word quessing game. Enter -1 to terminate.");
		System.out.println("Currently, we have " + v.size() + " words.");
		while (true)
		{
			int rand_num;
			
			select_vec.clear();
			while (select_vec.size() < 4)
			{
				rand_num = rand.nextInt(v.size());
				if (!select_vec.contains(rand_num))
					select_vec.add(rand_num);
			}
			
			correct = rand.nextInt(4);
			System.out.println(v.get(select_vec.get(correct)).en + "?");
			for (int i = 0 ; i < 4 ; i++)
				System.out.print("(" + (i + 1) + ") " + v.get(select_vec.get(i)).kr + " ");
			System.out.print(":>");
			select = sc.nextInt();
			if (select == correct + 1)
				System.out.println("Excellent!!");
			else if (select == -1)
				break;
			else
				System.out.println("No!!");
		}
		sc.close();
	}
}

class Word {
	String en, kr;
	
	Word(String en, String kr) {
		this.en = en;
		this.kr = kr;
	}
}
