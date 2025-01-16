import java.util.Scanner;

class Power{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base:");
        double Base = sc.nextDouble();

        System.out.print("Enter expo: ");
        double expo=  sc.nextDouble();


        double pow = Math.pow(Base,expo);
        System.out.println("Power is "+ pow );



    }
}