import java.util.Scanner;

public class UppercaseConversionAndComparisonn {

    // Method to convert text to uppercase using ASCII values and charAt()
    public static String convertToUppercase(String text) {
        StringBuilder upperCaseText = new StringBuilder();
        
        // Iterate through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // If the character is lowercase (ASCII value between 'a' and 'z')
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase using ASCII value logic
                upperCaseText.append((char) (ch - 32));
            } else {
                // Otherwise, append the character as is
                upperCaseText.append(ch);
            }
        }
        
        return upperCaseText.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String text1, String text2) {
        return text1.equals(text2); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input as text
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Convert the input using the custom convertToUppercase method
        String customUppercase = convertToUppercase(userInput);

        // Convert the input using the built-in toUpperCase method
        String builtInUppercase = userInput.toUpperCase();

        // Compare the results using the user-defined compareStrings method
        boolean areEqual = compareStrings(customUppercase, builtInUppercase);

        
        System.out.println("Original Text: " + userInput);
        System.out.println("Custom Uppercase Conversion: " + customUppercase);
        System.out.println("Built-in Uppercase Conversion: " + builtInUppercase);
        
        
        if (areEqual) {
            System.out.println("Both conversions result in the same uppercase text.");
        } else {
            System.out.println("The conversions result in different uppercase texts.");
        }
    }
}
