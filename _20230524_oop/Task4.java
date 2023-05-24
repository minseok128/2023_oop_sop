import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuffer sb = new StringBuffer(scanner.nextLine());
        String command;
        while(true) {
            System.out.print("Command : ");
            command = scanner.nextLine();
            if(command.equalsIgnoreCase("stop")) {
                System.out.println("Terminating");
                break;
            }
            String[] cmdParts = command.split("!");
            if(cmdParts.length != 2) {
                System.out.println("Wrong command");
                continue;
            }
            int startIndex = sb.indexOf(cmdParts[0]);
            if(startIndex == -1) {
                System.out.println("Can't find!");
                continue;
            }
            sb.replace(startIndex, startIndex + cmdParts[0].length(), cmdParts[1]);
            System.out.println(sb.toString());
        }
        scanner.close();
    }
}
