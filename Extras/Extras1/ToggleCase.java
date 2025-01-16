import java.util.Scanner;

public class ToggleCase {

    // Method to toggle the case of each character in the string
    public static String toggleCase(String str) {
        StringBuilder toggledString = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                // Convert to lowercase if it's uppercase
                toggledString.append(Character.toLowerCase(ch));
            }
            // Check if the character is lowercase
            else if (Character.isLowerCase(ch)) {
                // Convert to uppercase if it's lowercase
                toggledString.append(Character.toUpperCase(ch));
            }
            else {
                // If it's not a letter (e.g., a number or punctuation), keep it as it is
                toggledString.append(ch);
            }
        }

        return toggledString.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the toggleCase method and get the result
        String toggledString = toggleCase(input);

        System.out.println("String after toggling case: " + toggledString);

    }
}
