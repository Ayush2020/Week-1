import java.util.Scanner;

class choclates{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int numberOfchocolates = sc.nextInt();
	int numberOfchildren = sc.nextInt();
	int choclateGet = numberOfchocolates/numberOfchildren;
	int remainChocolates = numberOfchocolates % numberOfchildren;
	
	System.out.println("The number of chocolates each child gets is " + choclateGet + " and the number of remaining choclates are " + remainChocolates);
	}
}