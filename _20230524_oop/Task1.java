import java.util.Calendar;

public class Task1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);

        System.out.println("Current time is " + hour + " hour " + minute + " minute");

        if (hour >= 4 && hour < 12) {
            System.out.println("Good Morning");
        } else if (hour < 18) {
            System.out.println("Good Afternoon");
        } else if (hour < 22) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
    }
}
