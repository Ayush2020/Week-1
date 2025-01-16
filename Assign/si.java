import java.util.Scanner;

class SI{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter P :");
        double P = sc.nextDouble();

        System.out.print("Enter R: ");
        double R =  sc.nextDouble();

        System.out.print("Enter T: ");
        int T = sc.nextInt();

        double SI = (P * R * T) / 100;
        System.out.println("Simple Interest "+ SI);



    }
}