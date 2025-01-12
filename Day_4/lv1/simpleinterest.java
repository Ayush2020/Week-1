import java.util.Scanner;

class SimpleInterest{
	//methord to calculate the SI
	public static double calculateSimpleInterest(double principal, double rate, double time){
		return(principal * rate* time) / 100;
	}
	
	public static void main(String []args){
	//Take the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal Amount : ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter the rate of Interest: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the time in years : ");
		double time = sc.nextDouble();
		
		double simpleInterest = calculateSimpleInterest(principal,rate,time);
		System.out.println("The Simple Interest is " + simpleInterest + " for principal " + principal + " rate of interest " + rate + " and time " + time);
	}
	
}