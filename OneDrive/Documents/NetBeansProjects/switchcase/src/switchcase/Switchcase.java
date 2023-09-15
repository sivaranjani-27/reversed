package switchcase;
import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args){
        Scanner in=new Scanner (System.in);
         System.out.println("Enter a value:");
        int num=in.nextInt();
        switch(num){
            case 1: {
                System.out.println("one");
            break;
            }
            case 2: 
            {
                System.out.println("two");
            break;
            }
            case 3: 
            {
                System.out.println("three");
            break;
            }  
        }
    }   
}
