import java.util.Scanner;

public class SplitTextWithLengths {

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int length = 0;
        try {
            while (text.charAt(length) != 0) length++;
        } catch (StringIndexOutOfBoundsException e) {}
        return length;
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {
        StringBuilder word = new StringBuilder();
        String[] tempWords = new String[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || i == text.length() - 1) {
                if (i == text.length() - 1) word.append(text.charAt(i));
                tempWords[count++] = word.toString();
                word.setLength(0); // Reset for next word
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        String[] words = customSplit(userInput); 
        String[][] wordLengths = getWordsWithLengths(words); 

        
        System.out.println("Word\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }
    }
}
