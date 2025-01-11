import java.util.Scanner;

class Distance{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	
	double distanceInFeet = sc.nextDouble();
	double distanceInYards = distanceInFeet/3;
	double distanceInMiles = distanceInFeet / (1760 * 3);
	
	System.out.println("Your distance in yards :" + distanceInYards + "and in miles : " + distanceInMiles);
	
	}	
}