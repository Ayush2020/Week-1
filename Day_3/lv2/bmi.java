import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // Create arrays to store weight, height, BMI, and weight status
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        // Take input for the weight and height of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            weight[i] = sc.nextDouble();
            System.out.print("Height (meters): ");
            height[i] = sc.nextDouble();

            // Calculate the BMI: BMI = weight / (height * height)
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine the weight status based on BMI
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

       
        System.out.println("\nBMI and Weight Status of Each Person:");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Person", "Weight", "Height", "BMI", "Weight Status");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-15s%-15s%-15s%-15s%-15s\n\n", i + 1, weight[i], height[i], bmi[i], weightStatus[i]);
        }
    }
}
