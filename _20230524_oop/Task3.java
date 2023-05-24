import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String input = scanner.nextLine();
        String rotated = input;
        for (int i = 0; i < input.length(); i++) {
            rotated = rotated.substring(1) + rotated.charAt(0);
            System.out.println(rotated);
        }
        scanner.close();
    }
}
