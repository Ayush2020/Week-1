import java.util.Scanner;

class unitPrice{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	double price = sc.nextDouble();
	double quantity = sc.nextDouble();
	
	double totalPrice = price * quantity;
	
	System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and the unit price is INR " + price);
	
	}
}