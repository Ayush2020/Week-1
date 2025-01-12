class NumberChecker5{

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create an array to store factors
        int[] factors = new int[count];
        int index = 0;

        // Populate the factors array
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        int greatest = factors[0];
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors using the factors array
    public static int findSumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int findProductOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of the factors using the factors array
    public static double findProductOfCubesOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = findSumOfFactors(number);
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = findSumOfFactors(number);
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = findSumOfFactors(number);
        return sum < number;
    }

    // Method to find the factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    public static void main(String[] args) {
        int number = 28;  // You can change this number for testing

        // Find factors of the number
        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        //  greatest factor
        System.out.println("Greatest factor: " + findGreatestFactor(number));

        // sum of the factors
        System.out.println("Sum of factors: " + findSumOfFactors(number));

        // product of the factors
        System.out.println("Product of factors: " + findProductOfFactors(number));

        //product of the cubes of the factors
        System.out.println("Product of cubes of factors: " + findProductOfCubesOfFactors(number));

        // a perfect number
        System.out.println(number + " is a perfect number: " + isPerfectNumber(number));

        // an abundant number
        System.out.println(number + " is an abundant number: " + isAbundantNumber(number));

        // deficient number
        System.out.println(number + " is a deficient number: " + isDeficientNumber(number));

        // strong number
        System.out.println(number + " is a strong number: " + isStrongNumber(number));
    }
}
