import java.util.Scanner;

class Temp{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temp : ");

        double Celsius = sc.nextDouble();
        double Far = (Celsius * 9/5) + 32;

        System.out.println("Temp in fahren: " + Far);

    }
}