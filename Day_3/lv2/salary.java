import java.util.Scanner;

class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] bonus = new double[10];
        double[] yearsOfService = new double[10];
        double[] oldSalary = new double[10];
        double[] newSalary = new double[10];


        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 1; i < 10; i++) {
            boolean validInput = false;

            while (!validInput) {

                //Taking input for old salary and years of services
                System.out.println("Enter the old salary: " );
                oldSalary[i] = sc.nextDouble();

                System.out.println("Enter the years of service : ");
                yearsOfService[i] = sc.nextDouble();

                if (oldSalary[i] <= 0 || yearsOfService[i] < 0) {
                    System.out.println("Invalid input");
                    i--;
                    break;
                }

                validInput = true;

            }
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = oldSalary[i] * 0.05; // 5 % bonus for more than 5 years
            } else {
                bonus[i] = oldSalary[i] * 0.02; // 2 % bonus for less than 5 years			}
            }

            newSalary[i] = oldSalary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += oldSalary[i];
            totalNewSalary += newSalary[i];

            System.out.println("\n--- Summary ---");
            System.out.println("Total Bonus Payout: " + totalBonus);
            System.out.println("Total Old Salary: " + totalOldSalary);
            System.out.println("Total New Salary: " + totalNewSalary);


        }
    }
}