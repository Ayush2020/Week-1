import java.util.Scanner;

class Height{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	double heightInCm = sc.nextDouble();
	double cmPerInch = 2.54;
	int inchPerFoot = 12;
	
	double heightToInch = heightInCm / cmPerInch;
	double feet = heightToInch / inchPerFoot;
	double inch = heightToInch % inchPerFoot;
	
	System.out.println("Your Height in cm is " + heightInCm +  "while in feet is " + feet + " and inches is " + inch);
	
	
	}
}