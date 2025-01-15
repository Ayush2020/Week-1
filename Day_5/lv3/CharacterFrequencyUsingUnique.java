import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character is already encountered
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array of the correct size to return only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }

    // Method to find the frequency of characters in a string and return them in a 2D array
    public static String[][] findCharacterFrequencies(String text) {
        // Create an array to store the frequency of characters (256 ASCII values)
        int[] frequency = new int[256];
        
        // Loop through the string to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment frequency of the current character
        }

        // Find the unique characters in the text
        char[] uniqueChars = findUniqueCharacters(text);

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters and store them along with their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); 
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); 
        }

        return result;
    }

    // Method to display the character frequencies
    public static void displayCharacterFrequencies(String[][] frequencyData) {
        System.out.println("Character\tFrequency");
        
        
        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(frequencyData[i][0] + "\t\t" + frequencyData[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

      
        String[][] frequencyData = findCharacterFrequencies(inputString);
        displayCharacterFrequencies(frequencyData);
 
    }
}
