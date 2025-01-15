import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the text without using String length() method
    public static int getLength(String text) {
        int length = 0;
        while (true) {
            try {
                // Try accessing each character until an exception occurs 
                text.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;  
            }
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = getLength(text);  // Get the length of the string
        char[] uniqueChars = new char[length];  // Array to store unique characters
        int uniqueCount = 0;  
        
        // Outer loop: Iterate through each character of the string
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop: Check if the current character has already appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;  // If a match is found, it's not unique
                }
            }

            // If the character is unique, store it in the result array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array of the correct size to return the result
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        
        char[] uniqueChars = findUniqueCharacters(inputString);

       
        displayUniqueCharacters(uniqueChars);
    }
}
