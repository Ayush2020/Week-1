import java.util.Scanner;

public class NumberFormatExceptionn{

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        // This will attempt to convert the input text to an integer
        
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException and generic runtime exception
    public static void handleException(String text) {
        try {
            generateNumberFormatException(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Invalid input. Please enter a valid number.");
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a string to convert to a number: ");
        String userInput = sc.nextLine();

        // Call the method to handle exception
        handleException(userInput);
    }
}
