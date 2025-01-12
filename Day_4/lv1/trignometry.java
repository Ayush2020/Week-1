import java.util.Scanner;

class TrigonometricFunctionsCalculator {

    // Method to calculate trigonometric functions: sine, cosine, and tangent
    public double[] calculateTrigonometricFunctions(double angle) {
       
        double radians = Math.toRadians(angle);

        // Calculate the sine, cosine, and tangent of the angle
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrigonometricFunctionsCalculator calculator = new TrigonometricFunctionsCalculator();

        // Take user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        
        double[] result = calculator.calculateTrigonometricFunctions(angle);

       
        System.out.println("Sine of " + angle + " degrees: " + result[0]);
        System.out.println("Cosine of " + angle + " degrees: " + result[1]);
        System.out.println("Tangent of " + angle + " degrees: " + result[2]);

    }
}
