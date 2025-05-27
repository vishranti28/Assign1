import java.util.Scanner;

public class subtract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        double difference = num1 - num2;

        System.out.println("The difference is: " + difference);
        input.close();
    }
}