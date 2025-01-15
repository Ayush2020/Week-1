import java.util.Scanner;

public class SplitTextComparison {

    // Method to find the length of a String without using the built in method
    public static int findStringLength(String text) {
        int length = 0;
        while (true) {
            try {
                text.charAt(length);  
                length++;            
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to split the text into words using charAt() and without using the built in split method
    public static String[] customSplit(String text) {
        // Count the number of words by finding space indexes
        int length = findStringLength(text);
        int wordCount = 1; // Start with one word at least

        // Loop through the string to count words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++; // Increment the word count when a space is encountered
            }
        }

        // Store the indexes of spaces in a 1D array
        int[] spaceIndexes = new int[wordCount - 1]; // Space count is one less than word count
        int spaceIndex = 0;
        int wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex] = i; // Store space index
                spaceIndex++;
            }
        }

        // Create an array to store words
        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordCountIndex = 0;

        // Add the first word (from start to the first space, or end if no spaces)
        for (int i = 0; i < spaceIndexes.length; i++) {
            words[wordCountIndex++] = text.substring(startIndex, spaceIndexes[i]);
            startIndex = spaceIndexes[i] + 1; // Move start index after space
        }

        // Add the last word after the last space
        words[wordCountIndex] = text.substring(startIndex);

        return words; 
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false; // If lengths are not equal, arrays are not the same
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false; // If any word is not the same, arrays are not equal
            }
        }
        return true; // All words are the same, arrays are equal
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input as text
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Call the custom method to split the text into words
        String[] customSplitWords = customSplit(userInput);

        // Call the built-in split() method to split the text into words
        String[] builtInSplitWords = userInput.split(" ");

        // Compare the results using the compareStringArrays method
        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);

      
        System.out.println("Original Text: " + userInput);
        System.out.print("Custom Split Words: ");
        for (String word : customSplitWords) {
            System.out.print(word + " ");
        }
        System.out.println();
        
        System.out.print("Built-in Split Words: ");
        for (String word : builtInSplitWords) {
            System.out.print(word + " ");
        }
        System.out.println();

    
        if (areEqual) {
            System.out.println("Both methods resulted in the same word list.");
        } else {
            System.out.println("The word lists from both methods are different.");
        }
    }
}
