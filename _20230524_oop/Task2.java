import java.util.Scanner;
import java.util.StringTokenizer;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print(">> ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Terminating...");
                break;
            }

            StringTokenizer tokenizer = new StringTokenizer(input, " ");
            System.out.println("Number of words are " + tokenizer.countTokens());
        }

        scanner.close();
    }
}
