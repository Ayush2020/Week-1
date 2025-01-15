import java.util.Scanner;

public class SplitTextAndFindShortestLongest {

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int length = 0;
        try {
            while (text.charAt(length) != 0) length++; // Iterate through the string until the end
        } catch (StringIndexOutOfBoundsException e) {}
        return length;
    }

    // Method to split the text into words using charAt() without using the built-in split() method
    public static String[] customSplit(String text) {
        StringBuilder word = new StringBuilder();
        String[] tempWords = new String[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || i == text.length() - 1) {
                if (i == text.length() - 1) word.append(text.charAt(i));
                tempWords[count++] = word.toString();
                word.setLength(0); 
            } else {
                word.append(text.charAt(i));
            }
        }

        String[] words = new String[count];
        System.arraycopy(tempWords, 0, words, 0, count); // Resize array to remove null values
        return words;
    }

    // Method to return words with their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find the shortest and longest word based on the word lengths
    public static int[] findShortestAndLongest(String[][] wordLengths) {
        int[] result = new int[2]; 
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;

        // Iterate through the 2D array to find the shortest and longest
        for (int i = 0; i < wordLengths.length; i++) {
            int length = Integer.parseInt(wordLengths[i][1]);
            if (length < minLength) {
                minLength = length;
                result[0] = i; // Index of shortest word
            }
            if (length > maxLength) {
                maxLength = length;
                result[1] = i; // Index of longest word
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Split the input into words using the customSplit method
        String[] words = customSplit(userInput);

        String[][] wordLengths = getWordsWithLengths(words);

        int[] shortestAndLongest = findShortestAndLongest(wordLengths);

        System.out.println("Word\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }       
        System.out.println("\nShortest Word: " + wordLengths[shortestAndLongest[0]][0] + " (Length: " + wordLengths[shortestAndLongest[0]][1] + ")");
        System.out.println("Longest Word: " + wordLengths[shortestAndLongest[1]][0] + " (Length: " + wordLengths[shortestAndLongest[1]][1] + ")");
    }
}
