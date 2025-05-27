import java.util.Scanner;

public class UserID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();

        if (userId.equals("jake123")) {
            System.out.println("Name: Jake");
            System.out.println("Age: 30");
        } else {
            System.out.println("User ID not found.");
        }

        scanner.close();
    }
}