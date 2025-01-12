import java.util.Arrays;

class NumberChecker {

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

    // Method to check if the number is a Duck Number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;  // It has a non-zero digit
            }
        }
        return false;  // If all digits are zero, return false
    }

    // Method to check if the number is an Armstrong Number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int numDigits = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        
        int number = 153;

        // Find the digits of the number
        int[] digits = storeDigits(number);
        
        // Count the digits
        System.out.println("Count of digits: " + countDigits(number));
        
        // Check if the number is a Duck Number
        System.out.println("Is Duck Number? " + isDuckNumber(number));
        
        // Check if the number is an Armstrong Number
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number));
        
        // Find the largest and second largest digits
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestAndSecondLargest[0]);
        System.out.println("Second Largest Digit: " + largestAndSecondLargest[1]);
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second Smallest Digit: " + smallestAndSecondSmallest[1]);
    }
}
