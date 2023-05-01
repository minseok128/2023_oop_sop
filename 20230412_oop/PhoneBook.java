import java.util.Scanner;

public class PhoneBook {
    Scanner sc = new Scanner(System.in);
    Phone[] book;
    int size;

    void run() {
        set();
        search();
        sc.close();
    }

    void set() {
        System.out.print("Number of people >> ");
        size = sc.nextInt();
        book = new Phone[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Name and Tel >> ");
            book[i] = new Phone(sc.next(), sc.next());
        }
        System.out.println("Saved...");
    }

    void search() {
        String name;

        while (true) {
            System.out.print("Search Name >> ");
            name = sc.next();
            if (name.equals("Stop"))
                break;

            int i = 0;
            for (; i < size; i++) {
                if (book[i].name.equals(name)) {
                    book[i].show();
                    break;
                }
            }
            if (i == size)
                System.out.println("No " + name + " in the phone");
        }
    }
}
