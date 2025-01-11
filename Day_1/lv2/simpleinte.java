import java.util.Scanner;

class simpleInterest{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	double principal = sc.nextDouble();
	double rate = sc.nextDouble();
	double time = sc.nextDouble();
	
	double simpleinterest = (principal * rate * time )/ 100;
	
	System.out.println("The simple interest is " + simpleinterest + " for Principal " + principal + " Rate of Interest " + rate + " and time " + time);
	}
}