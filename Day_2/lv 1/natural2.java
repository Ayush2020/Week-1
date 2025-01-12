import java.util.Scanner;

class SumOfNaturalNumbers2{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sumUsingFormula = n * (n + 1) / 2;

            int sumUsingLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumUsingLoop += i;
            }

           
            System.out.println("Sum using formula (n * (n + 1) / 2): " + sumUsingFormula);
            System.out.println("Sum using for loop: " + sumUsingLoop);

            if (sumUsingFormula == sumUsingLoop) {
                System.out.println("The results are correct and match!");
            } else {
                System.out.println("The results do not match.");
            }
        }

    }
}
