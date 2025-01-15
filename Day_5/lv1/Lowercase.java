import java.util.Scanner;

class LowercaseConversionAndComparisonn {

    // Method to convert text to lowercase using ASCII values and charAt()
    public static String convertToLowercase(String text) {
        StringBuilder lowerCaseText = new StringBuilder();

        // Iterate through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // If the character is uppercase (ASCII value between 'A' and 'Z')
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII value logic
                lowerCaseText.append((char) (ch + 32));
            } else {
                //  append the character as is
                lowerCaseText.append(ch);
            }
        }

        return lowerCaseText.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String text1, String text2) {
        return text1.equals(text2); // Compare the two strings directly
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input as text
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Convert the input using the custom convertToLowercase method
        String customLowercase = convertToLowercase(userInput);

      
        String builtInLowercase = userInput.toLowerCase();

       
        boolean areEqual = compareStrings(customLowercase, builtInLowercase);

        
        System.out.println("Original Text: " + userInput);
        System.out.println("Custom Lowercase Conversion: " + customLowercase);
        System.out.println("Built-in Lowercase Conversion: " + builtInLowercase);
        
        if (areEqual) {
            System.out.println("Both conversions result in the same lowercase text.");
        } else {
            System.out.println("The conversions result in different lowercase texts.");
        }

    }
}
