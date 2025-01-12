import java.util.Scanner;

class Athlete{

    public static int rounds(double perimeter){
        //total distance in meteres (5 km = 5000m)
        double totalDistance = 5000;
        return (int) Math.ceil(totalDistance/perimeter);
    }
    public static void main(String []args){
        //   create an sc object to take an input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sides : ");
        //taken an user input
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        double perimeter =   side1 * side2 * side3;

        int round = rounds(perimeter);

        System.out.println("The Athlete needs complete rounds " + round + " of 5 km " );


    }
}