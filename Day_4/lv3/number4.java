class NumberChecker4{

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

   
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        while (square > 0) {
            if (square % 10 != number % 10) {
                return false;
            }
            square /= 10;
            number /= 10;
        }
        return true;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        int number = 37; // Example number, you can change this to test other numbers

        //  number is prime
        System.out.println(number + " is a prime number: " + isPrime(number));

        // neon number
        System.out.println(number + " is a neon number: " + isNeon(number));

        //spy number
        System.out.println(number + " is a spy number: " + isSpy(number));

        // automorphic number
        System.out.println(number + " is an automorphic number: " + isAutomorphic(number));

        //  buzz number
        System.out.println(number + " is a buzz number: " + isBuzz(number));
    }
}
