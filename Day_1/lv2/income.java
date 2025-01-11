import java.util.Scanner;

class totalIncome{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int salary = sc.nextInt();
	int bonus = sc.nextInt();
	int total = salary + bonus;
	System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + total);
	
	}
}