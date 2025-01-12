import java.util.Scanner;

class BMI_Calculator {

    // Method to calculate BMI for each person
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightInCm = personData[i][1];
            double heightInMeters = heightInCm / 100; // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); // BMI formula
            personData[i][2] = bmi; // Store BMI in the third column
        }
    }

    // Method to determine the BMI status for each person
    public static String[] getBMIStatus(double[][] personData) {
        String[] bmiStatus = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi < 18.5) {
                bmiStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                bmiStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                bmiStatus[i] = "Overweight";
            } else {
                bmiStatus[i] = "Obesity";
            }
        }

        return bmiStatus;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array for storing weight, height, and BMI for 10 persons
        double[][] personData = new double[10][3];
        // Array to store BMI status for each person
        String[] bmiStatus = new String[10];

        // Input data for 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            System.out.print("Enter weight (kg): ");
            personData[i][0] = sc.nextDouble(); // Weight in kg

            System.out.print("Enter height (cm): ");
            personData[i][1] = sc.nextDouble(); // Height in cm
        }

        // Calculate BMI for each person
        calculateBMI(personData);

        // Get BMI status for each person
        bmiStatus = getBMIStatus(personData);

       
        System.out.println("\nDetails of all persons:");
       
        System.out.printf("%-15s%-15s%-10s%-15s%-15s\n", "Person", "Weight (kg)", "Height (cm)", "BMI", "Status");
 

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-15s%-15.2f%-10.2f%-15.2f%-15s\n",
                    "Person " + (i + 1), personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }

    }
}
