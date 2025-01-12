import java.util.Scanner;

class LargestAndSecondLargest2 {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define an array to store the digits of the number
        int maxDigit = 10;  // Set the initial size of the array
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits from the number and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                // If the array is full, double its size by creating a new array
                maxDigit += 10;  // Increase the maxDigit by 10
                int[] temp = new int[maxDigit]; // Create a temporary array with the new size
                
                // Copy existing elements from digits array to the temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                
                // Assign the temp array to the digits array
                digits = temp;
            }
            digits[index] = number % 10;  // Get the last digit
            number = number / 10;         // Remove the last digit
            index++;                      // Increment the index
        }

        // Find the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array and find the largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        if (largest != -1) {
            System.out.println("The largest digit is: " + largest);
        } else {
            System.out.println("No valid digits found.");
        }

        if (secondLargest != -1) {
            System.out.println("The second largest digit is: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }


    }
}


