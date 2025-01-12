import java.util.Scanner;


class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        
        while (true) {
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double number = sc.nextDouble();

            if (number <= 0) {
                break;
            }

            total += number;
        }

        System.out.println("The total sum is: " + total);

    }
}
