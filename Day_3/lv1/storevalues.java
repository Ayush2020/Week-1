import java.util.Scanner;

class StoreNumbers {
    public static void main(String[] args) {
        // Create an array of size 10 to store double values
        double[] numbers = new double[10];
        
        // Variable to store the total sum of numbers
        double total = 0.0;
        
        // Variable to track the index of the array
        int index = 0;
        
        // Create a sc object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Infinite loop to keep accepting user input until a stop condition is met
        while (true) {
            // Ask the user for a number
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double input = sc.nextDouble();
            
            // Check if the number is 0 or negative or if the array size limit (10) is reached
            if (input <= 0 || index == 10) {
                break; // Exit the loop if the condition is met
            }
            
            // Store the input value in the array and increment the index
            numbers[index] = input;
            index++;
        }
        
        // Calculate the total sum of the numbers stored in the array
        for (int i = 0; i < index; i++) {
            total += numbers[i]; // Add each number to the total
        }
        
        // Display the entered numbers
        System.out.println("You entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        
        // Display the total sum
        System.out.println("The total sum of the numbers is: " + total);
        
        
    }
}
