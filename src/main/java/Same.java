
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        // Prompt the user for two strings
        System.out.println("Enter the first string:");
        String string1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String string2 = scan.nextLine();

        // Compare the strings and tell the user if they are the same or different
        if (string1.equals(string2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
