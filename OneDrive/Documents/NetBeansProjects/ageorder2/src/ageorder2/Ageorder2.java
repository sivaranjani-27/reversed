package ageorder2;
import java.util.Scanner;

import java.util.Scanner;

public class Ageorder2 {

        public static void main(String[] args) {

         Scanner in=new Scanner(System.in);
         int a,b,c;
            System.out.println("Enter a age:");
            a=in.nextInt();
            System.out.println("Enter b age:");
            b=in.nextInt();
            System.out.println("Enter c age:");
            c=in.nextInt();
            if(a>=b && a>=c )
               {
                System.out.println("A is greater");
                                }
            else if(b>=a && b>=c)
                {
                System.out.println("B is greater");
                                            }

            else if(c>=b && c>=a)
            {
                System.out.println("C is greater");
                           }
            {
            if(a>=b && a<=c )
               {
                System.out.println("A is middler");
                                }
            else if(b>=a && b<=c)
                {
                System.out.println("B is middler");
                                            }

            else if(c>=b && c<=a)
            {
                System.out.println("C is middler");
                           }
            }
            {
            if(a<=b && a<=c )
               {
                System.out.println("A is smaller");
                                }
            else if(b<=a && b<=c)
                {
                System.out.println("B is smaller");
                                            }

             else if(c<=b && c<=a)
            {
                System.out.println("C is smaller");
                           }
            }

              
                            }

            }
             
    
    

