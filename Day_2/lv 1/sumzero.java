import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number;

        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            number = sc.nextDouble();

            if (number != 0) {
                total += number;
            }

        } while (number != 0); 
        System.out.println("The total sum is: " + total);
    }
}
