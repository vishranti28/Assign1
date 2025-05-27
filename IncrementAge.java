import java.util.Scanner;

public class IncrementAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        int incrementedAge = age + 1;
        System.out.println("Your age next year will be: " + incrementedAge);
        scanner.close();
    }
}