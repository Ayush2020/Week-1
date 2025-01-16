import java.util.Scanner;

class Average{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1:");
        double A = sc.nextDouble();

        System.out.print("Enter number 2: ");
        double B =  sc.nextDouble();

        System.out.print("Enter number 3: ");
        double C =  sc.nextDouble();


        double average = (A+B+C)/3;
        System.out.println("Average is "+ average );



    }
}

