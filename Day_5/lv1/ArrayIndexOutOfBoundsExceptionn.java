import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionn {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names, int index) {
        System.out.println("Accessing element at index: " + index);
        System.out.println("Name at index: " + names[index]); // This will throw exception if index is out of bounds
    }

    // Method to handle ArrayIndexOutOfBoundsException and generic runtime exception
    public static void handleException(String[] names, int index) {
        try {
            generateArrayIndexOutOfBoundsException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index " + index + " is out of bounds for the array.");
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        System.out.print("Enter an index to access in the names array: ");
        int userIndex = sc.nextInt();

        // Call the method to handle exception
        handleException(names, userIndex);

    }
}
