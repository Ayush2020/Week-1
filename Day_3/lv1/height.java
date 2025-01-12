import java.util.Scanner;

class PlayersHeight{
	public static void main(String []args){
		
		// created a double array name height  size of 11
		double[] heights = new double[11];
		//Create a variable to store a sum of height
		double sum = 0.0;
		
		// created an sc objext for the user input
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<11; i++){
			System.out.println("Enter the height of player : ");
			heights[i] = sc.nextInt();
			sum += heights[i];
		}
		double meanHeight = sum/11;
		
		System.out.println("The mean height of the 11 players is : " + meanHeight);
		
	}
}