import java.util.Scanner;

class BMI_Calculator {
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        System.out.print("weight (in kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("height (in cm): ");
        double heightInCm = scanner.nextDouble();
        
        // Convert height from cm to meters
        double heightInM = heightInCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightInM * heightInM);

        // Display the BMI result
        System.out.println("The BMI is: " + bmi);

        // Determine weight status based on BMI
        if (bmi < 18.5) {
            System.out.println("Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Status: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

       
    }
}
