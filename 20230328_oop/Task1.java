import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        for (int i = c; i >= 'a'; i--) {
            for (int j = 'a'; j <= i; j++)
                System.out.print((char) j);
            System.out.print('\n');
        }
        sc.close();
    }
}
