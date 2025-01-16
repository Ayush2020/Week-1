import java.util.Scanner;

class Miles{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometers :");
        double km = sc.nextDouble();

        double  Miles = km * 0.621371;
        System.out.println("Miles is "+ Miles );



    }
}