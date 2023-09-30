package ifelse;

import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, password;
        int pin;
        System.out.println("Enter user name:");
        name = in.nextLine();
        System.out.println("Enter password:");
        password = in.nextLine();
        if (name.equals("ranju") && password.equals("karthi"))
        {
            System.out.println("login");
        }
         else
         {    System.out.println("retry again");
       
        }
    }

    }

}
