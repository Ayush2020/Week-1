public class StringTrimmer {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String str) {
        int start = 0, end = str.length() - 1;
        
        // Find the index where the first non-space character appears (from the beginning)
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        
        // Find the index where the last non-space character appears (from the end)
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String inputStr = "   Hello, World!   ";
        
        // Call trimSpaces to get the start and end indices
        int[] trimmedIndices = trimSpaces(inputStr);
        int start = trimmedIndices[0];
        int end = trimmedIndices[1];
        
        // Create a substring using the user-defined method
        String trimmedStrUsingCharAt = createSubstring(inputStr, start, end);
        
        // Use the built-in trim() method to trim the string
        String trimmedStrUsingBuiltIn = inputStr.trim();
        
        
        boolean areEqual = compareStrings(trimmedStrUsingCharAt, trimmedStrUsingBuiltIn);
        
        
        System.out.println("Trimmed string (using charAt): '" + trimmedStrUsingCharAt + "'");
        System.out.println("Trimmed string (using built-in trim): '" + trimmedStrUsingBuiltIn + "'");
        System.out.println("Do both methods give the same result? " + areEqual);
    }
}
