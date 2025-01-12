import java.util.Scanner;

class BMIProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Declare the 2D array for storing weight, height, and BMI
        double[][] personData = new double[number][3];
        // Declare the array for storing weight status
        String[] weightStatus = new String[number];

        // Loop to take input for height and weight for each person
        for (int i = 0; i < number; i++) {
            double weight = -1, height = -1;
            while (weight <= 0) {
                System.out.println("Enter weight for person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            }
            while (height <= 0) {
                System.out.print("Enter height for person " + (i + 1) + " (in meters): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            }

            // Store the weight and height in the personData array
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI and store it in the personData array
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status and store it in the weightStatus array
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the details (height, weight, BMI, and status) for each person
        System.out.println("\nDetails of persons:");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d:\n", i + 1);
            System.out.printf("Height: %.2f meters\n", personData[i][1]);
            System.out.printf("Weight: %.2f kg\n", personData[i][0]);
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}
