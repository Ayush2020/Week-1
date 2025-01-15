import java.util.Scanner;

class SubstringComparison {
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    public static boolean compareStringsCharAt(String str1, String str2) {
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
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the text: ");
        String text = sc.next();

        System.out.print("Enter the start index: ");
        int start = sc.nextInt();

        System.out.print("Enter the end index: ");
        int end = sc.nextInt();
        
        String substringUsingCharAt = createSubstringUsingCharAt(text, start, end);
        String substringUsingSubstring = text.substring(start, end);

        
        boolean areEqual = compareStringsCharAt(substringUsingCharAt, substringUsingSubstring);

        
        System.out.println("Substring using charAt: " + substringUsingCharAt);
        System.out.println("Substring using substring: " + substringUsingSubstring);
        System.out.println("substrings equal " + areEqual);
    }
}


