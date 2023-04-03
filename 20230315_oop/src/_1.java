import java.util.*;

public class _1 {
    public static void main(String[] args) {
        Scanner sc = Scanner(System.in);
        System.out.print("Input won >> ");
        double won = sc.nextDouble();
        double result = won / 1100.0;
        System.out.printf("%.0f won is $%.1f\n", won, result);
        sc.close();
    }

