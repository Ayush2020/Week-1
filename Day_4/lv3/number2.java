class NumberChecker2{

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2];  // 10 digits (0-9), first column for digits, second for frequency
        
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;  // Fill first column with digits (0-9)
        }
        
        // Count frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        
        return frequency;
    }

    public static void main(String[] args) {
        // Example number
        int number = 21;

        // Count digits
        System.out.println("Count of digits: " + countDigits(number));
        
        // Store digits and print them
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(number));

        // Sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));

        // Check if it is a Harshad number
        System.out.println("Is Harshad number? " + isHarshadNumber(number));

        // Get the frequency of digits
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " occurs " + frequency[i][1] + " times.");
            }
        }
    }
}
