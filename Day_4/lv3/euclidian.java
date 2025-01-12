import java.util.Scanner;

class EuclideanDistanceAndLineEquation {

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Euclidean distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the slope (m) and y-intercept (b) of the line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate the slope (m)
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculate the y-intercept (b)
        double b = y1 - m * x1;
        
        // Return the slope and y-intercept as an array
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking inputs for the two points (x1, y1) and (x2, y2)
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        
        // Calculating the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the points: " + distance);
        
        // Calculating the slope and y-intercept
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];

        System.out.println("Equation of the line: y = " + slope + "x + " + intercept);
    }
}
