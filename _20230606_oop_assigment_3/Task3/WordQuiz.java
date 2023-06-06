import java.util.Vector;
import java.util.Scanner;
import java.util.Random;
import java.util.Set;

public class WordQuiz {
	public static void main(String[] args)
	{
		var v = new Vector<Word>();
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
	}
}

class Word {
	String en, kr;
	
	Word(String en, String kr) {
		this.en = en;
		this.kr = kr;
	}
}
