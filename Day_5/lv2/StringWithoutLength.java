import java.util.Scanner;

class StringWithoutLength{

    public static int length(String str){
        int size = 0;
        try{
            for(int i = 0; i < Integer.MAX_VALUE; i++){
                char c = str.charAt(i);
                size++;
            }
        }
        catch(StringIndexOutOfBoundsException e){
                return size;
        }
        return 0;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String text = sc.next();


        int userInput = length(text);

        int builtIn = text.length();

        System.out.println("USer defined length : " + userInput);
        System.out.println("Inbuilt length : " + builtIn);
        
    }
}