import java.util.Scanner;

class distanceConvert{
	public static void main(String []args){
	double km ;
	Scanner sc = new Scanner(System.in);
	
	km = sc.nextInt();
	double mile = 1.6;
	double totalMile = km * mile;
	
	System.out.println("The total miles is " + totalMile + " mile for given " + km);
	
	
	}
}