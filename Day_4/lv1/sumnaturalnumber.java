
import java.util.Scanner;

class SumOfNaturalNumbers {

    // Method to find the sum of the first n natural numbers using a loop
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add each number to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();


        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {

            int sum = findSum(n);

            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

    }
}
