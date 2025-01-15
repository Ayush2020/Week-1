import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoops {

    // Method to find the frequency of characters in a string and return them in a 1D array
    public static String[] findCharacterFrequencies(String text) {
        // Convert the string to a character array
        char[] charArray = text.toCharArray();

        // Array to store the frequency of each character
        int[] frequency = new int[charArray.length];

        // 1D array to store the results (character and its frequency)
        String[] result = new String[charArray.length];

        // Outer loop to iterate through each character in the string
        for (int i = 0; i < charArray.length; i++) {
            // Skip counting if the character is already counted (i.e., frequency is 0)
            if (charArray[i] == '0') {
                continue;
            }

            // Initialize the frequency of this character to 1
            frequency[i] = 1;

            // Inner loop to check for duplicates of the current character
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    frequency[i]++;
                    charArray[j] = '0'; 
                }
            }

            // Store the character and its frequency in the result array
            result[i] = charArray[i] + " : " + frequency[i];
        }

        return result;
    }

    // Method to display the character frequencies
    public static void displayCharacterFrequencies(String[] frequencyData) {
        System.out.println("Character Frequency:");

        // Loop to display each character and its frequency
        for (String entry : frequencyData) {
            if (entry != null) {
                System.out.println(entry);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        String[] frequencyData = findCharacterFrequencies(inputString);

        displayCharacterFrequencies(frequencyData);
    }
}
