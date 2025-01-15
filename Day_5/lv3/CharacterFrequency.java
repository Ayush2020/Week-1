import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        // Create an array to store the frequency of characters (256 ASCII values)
        int[] frequency = new int[256];
        
        // Loop through the string to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; 
        }

        // Count how many characters have a frequency greater than 0
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[count][2];
        int index = 0;
        
        // Loop through the frequency array and store the characters with their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]); 
                index++;
            }
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

        // Finding the character frequencies
        String[][] frequencyData = findCharacterFrequency(inputString);
        displayCharacterFrequencies(frequencyData);
    }
}
