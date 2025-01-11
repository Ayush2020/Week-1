import java.util.Scanner;


class Athelete{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double side1  = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5;
        double rounds = totalDistance/perimeter;
        System.out.println("he total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}