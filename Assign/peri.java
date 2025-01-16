import java.util.Scanner;

class Peri{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length :");
        double L = sc.nextDouble();

        System.out.print("Enter Width: ");
        double W =  sc.nextDouble();


        double peri = 2 * (L + W);
        System.out.println("Perimeter is "+ peri );



    }
}