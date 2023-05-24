import java.util.Scanner;

public class _task1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String arr[][] = new String[8][6];
        arr[0][0] = "Name";
        arr[0][1] = "Korean";
        arr[0][2] = "English";
        arr[0][3] = "Math";
        arr[0][4] = arr[6][0] = "Sum";
        arr[0][5] = arr[7][0] = "Mean";
        arr[6][1] = arr[6][2] = arr[6][3] = arr[7][4] = arr[7][5] = "0";
        for (int i = 1; i <= 5; i++) {
            int sum = 0;
            arr[i][0] = sc.next();
            for (int j = 1; j < 4; j++) {
                arr[i][j] = sc.next();
                sum += Integer.parseInt(arr[i][j]);
                arr[6][j] = (Integer.parseInt(arr[6][j]) + Integer.parseInt(arr[i][j])) + "";
            }
            arr[i][4] = sum + "";
            arr[i][5] = sum / 3.0 + "";
        }
        for (int i = 0; i < 6; i++)
            System.out.printf("%-7s ", arr[0][i]);
        System.out.print('\n');
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-7s ", arr[i][j]);
            }
            System.out.printf("%.1f\n", Double.parseDouble(arr[i][5]));
        }
        for (int i = 0; i < 4; i++)
            System.out.printf("%-7s ", arr[6][i]);
        System.out.printf("\n%-7s ", arr[7][0]);
        for (int i = 1; i < 4; i++)
            System.out.printf("%-7.1f ", Double.parseDouble(arr[6][i]) / 5.0);
        System.out.print('\n');
        sc.close();
    }
}

// tony 35 36 43
// andy 24 78 45
// emily 33 46 88
// joe 44 44 77
// messi 65 22 54
