import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String str) {
        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Variable to store the most frequent character and its frequency
        char mostFrequentChar = charArray[0];
        int maxFrequency = 0;

        // Loop through each character in the string
        for (int i = 0; i < charArray.length; i++) {
            int currentFrequency = 1;  

            // Compare the current character with the rest of the characters in the string
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    currentFrequency++;
                }
            }

            // If the current character's frequency is greater than the maxFrequency, update it
            if (currentFrequency > maxFrequency) {
                mostFrequentChar = charArray[i];
                maxFrequency = currentFrequency;
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Call the method to find the most frequent character
        char result = findMostFrequentCharacter(inputString);

        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
