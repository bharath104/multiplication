import java.util.Scanner;

public class MultiplicationProgram {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Perform multiplication
        double result = number1 * number2;

        // Display the result
        System.out.println("The result of multiplication is: " + result);

        // Close the scanner
        scanner.close();
    }
}
