import java.util.Scanner;

public class RemoveCharacterFromString {

    // Method to remove all occurrences of a specific character from a string
    public static String removeCharacter(String str, char chToRemove) {
        // Create a new StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Loop through the original string
        for (int i = 0; i < str.length(); i++) {
            // If the current character is not the one to be removed, add it to the result
            if (str.charAt(i) != chToRemove) {
                result.append(str.charAt(i));
            }
        }

        // Convert StringBuilder to String and return it
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for the string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Take input from the user for the character to remove
        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);

        // Call the removeCharacter method and get the modified string
        String modifiedString = removeCharacter(inputString, charToRemove);

        // Display the modified string
        System.out.println("Modified String: " + modifiedString);

    }
}
