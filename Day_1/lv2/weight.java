import java.util.Scanner;

class kgTopounds{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	double weight = sc.nextDouble();
	double pounds = weight * 2.2;
	
	System.out.println("The weight of the person in pound is " + pounds + "and in kg is " + weight);
	
	}
}