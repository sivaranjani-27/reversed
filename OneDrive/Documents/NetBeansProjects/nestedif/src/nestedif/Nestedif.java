package nestedif;
import java.util.Scanner;
public class Nestedif {

    public static void main(String[] args) {
    Scanner in=new Scanner (System.in);
        System.out.println("Enter the number:");
        int num=in.nextInt();
        {
        if (num%2==0) {
            System.out.println("even number");
        }
        else {        
            System.out.println("odd number");
        }    
            if (num%3==0){   
             System.out.println("number is odd");
                }  
            else {
                    System.out.println("number is even");

    }
        }
    }
}
            
                
    
    

