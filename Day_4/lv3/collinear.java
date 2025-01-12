import java.util.Scanner;

class CollinearPointsChecker {

    // Method to check if points are collinear using slope formula
    public static boolean arePointsCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the slopes of the lines AB and BC
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        // Check if all slopes are equal (to a tolerance level)
        return (slopeAB == slopeBC && slopeAB == slopeAC);
    }

    // Method to check if points are collinear using the area of the triangle formula
    public static boolean arePointsCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the area of the triangle formed by points A, B, and C
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // If area is 0, the points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs for the 3 points
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();

        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        System.out.print("Enter x3: ");
        int x3 = sc.nextInt();
        System.out.print("Enter y3: ");
        int y3 = sc.nextInt();

        // Check if points are collinear using slope formula
        boolean collinearUsingSlope = arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3);

        // Check if points are collinear using area formula
        boolean collinearUsingArea = arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        if (collinearUsingSlope && collinearUsingArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
    }
}
