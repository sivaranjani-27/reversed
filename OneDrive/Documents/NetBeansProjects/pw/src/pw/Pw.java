
package pw;
import java.util.Scanner;
public class Pw {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name,password;
        int pin;
        System.out.println("Enter user name:");
        name=in.nextLine();
         System.out.println("Enter password:");
        password=in.nextLine();
        System.out.println("Enter pin:");
        pin=in.nextInt();
        System.out.println("Login:");
        System.out.println(name.equals("ranju") && pin==2793 && password.equals("karthi"));
                
    }
    
}
