import java.util.Scanner;

class temperatureConversion{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	double celsius = sc.nextDouble();
	double fahrenhietResult = (celsius * 9/5) + 32;
	System.out.println("The " + celsius + " celsius is " + fahrenhietResult + " fahrenheit");
	
	}
}
