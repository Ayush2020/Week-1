import java.util.Scanner;

class Quadratic {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate delta (discriminant)
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots (delta is negative)
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for a, b, and c
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

     
        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("There are no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The root of the equation is: " + roots[0]);
        } else {
            System.out.println("The roots of the equation are: " + roots[0] + " and " + roots[1]);
        }
    }
}
