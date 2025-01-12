import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sumUsingFormula = n * (n + 1) / 2;

            int sumUsingLoop = 0;
            int i = 1;
            while (i <= n) {
                sumUsingLoop += i;
                i++;
            }

          
            System.out.println("Sum using formula (n * (n + 1) / 2): " + sumUsingFormula);
            System.out.println("Sum using while loop: " + sumUsingLoop);

            if (sumUsingFormula == sumUsingLoop) {
                System.out.println("The results are correct and match!");
            } else {
                System.out.println("The results do not match.");
            }
        }

    }
}
