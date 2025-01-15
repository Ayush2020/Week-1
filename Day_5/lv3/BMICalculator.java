import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status based on height (in cm) and weight (in kg)
    public static String[][] calculateBMIAndStatus(double[][] personData) {
        String[][] result = new String[10][4]; 

        for (int i = 0; i < 10; i++) {
            double weight = personData[i][0]; 
            double heightInCm = personData[i][1]; 
            double heightInMeters = heightInCm / 100; 
            double bmi = weight / (heightInMeters * heightInMeters); 

            // Determine BMI status
            String status = "";
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store the result (height, weight, BMI, status)
            result[i][0] = String.format("%.2f", heightInCm); 
            result[i][1] = String.format("%.2f", weight); 
            result[i][2] = String.format("%.2f", bmi); 
            result[i][3] = status; 
        }

        return result;
    }

    // Method to display the BMI table for all persons
    public static void displayBMITable(String[][] bmiData) {
        System.out.println("Person\tHeight (cm)\tWeight (kg)\tBMI\t\tStatus");


        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t", (i + 1));
            System.out.printf("%s\t\t", bmiData[i][0]);
            System.out.printf("%s\t\t", bmiData[i][1]);
            System.out.printf("%s\t", bmiData[i][2]);
            System.out.println(bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][2];

        // Input weight (kg) and height (cm) for each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

        String[][] bmiData = calculateBMIAndStatus(personData);
        displayBMITable(bmiData);

    }
}
