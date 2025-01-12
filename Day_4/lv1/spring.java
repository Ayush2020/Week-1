import java.util.Scanner;

class SpringSeason{

    public static boolean isSpringSeason(int month,int day){
        if ((month == 3 && day >= 20) || (month == 4 )|| (month == 5) || (month == 6 && day <= 20)){
            return true;
        }
        return false;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        //Take an user input
        System.out.println("Enter the month (1-12) : ");
        int month = sc.nextInt();

        System.out.println("Enter the day of month: ");
        int day = sc.nextInt();

        if (isSpringSeason(month,day)){
            System.out.println("Its a Spring Season");
        }else {
            System.out.println("Not a Spring Season");
        }
    }
}