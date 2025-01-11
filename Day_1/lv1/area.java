import java.util.Scanner;

class areaOfTriangle{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	double base = sc.nextDouble();
	double heightInInches = sc.nextDouble();
	
	
	double area = 1/2 * base * heightInInches;
	double areaSqInches = area * 2.54 * 2.54;
	double heightInFeet = heightInInches / 12;
	double heightInCm = heightInInches * 2.54;
	
	
	System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
	System.out.println(areaSqInches);
	
	}
}