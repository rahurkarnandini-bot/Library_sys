import java.util.ArrayList;
import java.util.Scanner;

public class LibraryConsole {

    static ArrayList<String> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        books.add("Java Programming");
        books.add("Python Basics");
        books.add("Data Structures");

        while (true) {
            System.out.println("\n--- Library Management ---");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) admin(sc);
            else if (ch == 2) user();
            else break;
        }
    }

    static void admin(Scanner sc) {
        System.out.println("1. Add Book");
        System.out.println("2. Delete Book");
        int c = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        if (c == 1) {
            books.add(book);
            System.out.println("Book Added");
        } else {
            books.remove(book);
            System.out.println("Book Deleted");
        }
    }

    static void user() {
        System.out.println("Available Books:");
        for (String b : books) {
            System.out.println("- " + b);
        }
    }
}