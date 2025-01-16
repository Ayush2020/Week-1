import java.util.Scanner;

public class BasicCalculator {

    // Function to perform addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function to perform subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function to perform multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function to perform division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Return NaN if division by zero
        }
        return a / b;
    }

    // Function to display the result
    public static void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the operation to perform
        System.out.println("Basic Calculator");
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        // Take the operation choice
        int choice = sc.nextInt();

        // Ask the user for two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Perform the selected operation and display the result
        double result;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                displayResult(result);
                break;
            case 2:
                result = subtract(num1, num2);
                displayResult(result);
                break;
            case 3:
                result = multiply(num1, num2);
                displayResult(result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    displayResult(result);
                }
                break;
            default:
                System.out.println("Invalid ");
                break;
        }
    }
}
