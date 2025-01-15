import java.util.Scanner;

public class StringIndexOutOfBounds {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String input) {
        // Attempt to access an index that is beyond the length of the string
        System.out.println("Accessing index 100 in the string: " + input.charAt(100));  // throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String input) {
        try {
            // Attempt to access an index that is beyond the length of the string
            System.out.println("Accessing index 100 in the string: " + input.charAt(100));  // will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception and print a message
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = sc.nextLine();  // Taking user input
        
        // Demonstrate the method that generates StringIndexOutOfBoundsException
        System.out.println("\nGenerating StringIndexOutOfBoundsException without handling it:");
        try {
            generateStringIndexOutOfBoundsException(userInput);  // This will throw the exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Second call: Demonstrate the method with exception handling
        System.out.println("\nHandling StringIndexOutOfBoundsException with try-catch block:");
        handleStringIndexOutOfBoundsException(userInput);  // This will handle the exception inside the method
        
    }
}
