import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task2 {
	public static void main(String[] args) throws IOException {
		var bf = new BufferedReader(new InputStreamReader(System.in));
		int[] histogram = new int[26];
		String word;
		String[] arr;

		while (true) {
			arr = bf.readLine().toUpperCase().split(" ");
			if (arr[0].equals(";"))
				break;
			for (int i = 0; i < arr.length; i++)
			{
				word = arr[i];
				for (int j = 0; j < word.length(); j++)
				{
					if (word.charAt(j) >= 'A' && word.charAt(j) <= 'Z')
						histogram[word.charAt(j) - 'A']++;
				}
			}
		}

		for (int i = 0; i < 26; i++)
		{
			System.out.println((char)('A' + i) + ": "+ histogram[i]);
		}
	}
}

/*
The club isn't the best place to find a lover
So the bar is where I go
Me and my friends at the table doing shots
Drinking fast and then we talk slow
And you come over and start up a conversation with just me
And trust me I'll give it a chance now
Take my hand, stop, put Van The Man on the jukebox
And then we start to dance, and now I'm singing like
Girl, you know I want your love
Your love was handmade for somebody like me
Come on now, follow my lead
I may be crazy, don't mind me
Say, boy, let's not talk too much
Grab on my waist and put that body on me
Come on now, follow my lead
Come, come on now, follow my lead
 */