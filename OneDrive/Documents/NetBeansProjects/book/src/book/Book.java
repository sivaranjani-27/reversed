
package book;

import java.util.ArrayList;
import java.util.Scanner;


public class Book {
static ArrayList<String>data=new ArrayList();
    static Scanner in=new Scanner(System.in);


        public static void addBook()
    {
        System.out.println("Enter the book name:");
        String Book=in.nextLine().toUpperCase();
        data.add(Book);
        System.out.println("Book Added\n");
       
    }
    public static void showBook()
    {
        if(data.size()!=0){
            System.out.println("-----All Book List-----");
            int si=1;
            for(String book:data)
            {
                System.out.println(si+"."+book);
            
            si++;
        }
    }

        else {
            System.out.println("Sorry This Is not available");
        }
        System.out.println("------Thank You-----\n");
    }
    public static boolean checkNum(String x)
    {
        boolean num=true;
    for(char c:x.toCharArray())
    {
if(c>=48 && c<=57)
    {
        num=true;
    }
    else
    {
        num=false;
        break;
    }
    }
    return num;
    }

    public static void removeBook(String option)    {
       if(checkNum(option))
       {
        data.remove(Integer.parseInt(option)-1);
    }
       else
       {
           data.remove(option);
       }
        System.out.println("Removed");
    }
         public static void updateBook(String option) {
    if (checkNum(option)) {
        int index=Integer.parseInt(option) - 1;
        if (index >= 0 && index < data.size()) {
            System.out.println("Enter the new name of the book:");
            String updatedBook = in.nextLine().toUpperCase();
            data.set(index, updatedBook);
            System.out.println("Book updated successfully.\n");

           }
           else
           {
               System.out.println("sorry! please try again \n");     
           }
    }
    else {
        if (data.contains(option)) {
            System.out.println("Enter the new name of the book:");
            String updatedBook = in.nextLine().toUpperCase();
            int index = data.indexOf(option);
            data.set(index, updatedBook);
            System.out.println("Book updated successfully.\n");
        } else {
            System.out.println("sorry! please try again.\n");
       }
    }
    }
         public static void main(String[]args){
        String menu=("-------choose the option--------\n1.Add new Books\n2.Show all the Books\n3.Remove the Books\n4.Update or (Edit) Book\n5.Exit or (0)");
        while(true)
        {
            System.out.println(menu);
            System.out.print("Enter the option:");
            String ch=in.nextLine().toLowerCase();
       if(ch.equals("1"))
       {
           addBook();
       }     
       else if(ch.equals("2"))
       {
           showBook();
       }   
       else if(ch.equals("3"))
       {
           System.out.println("Enter the Book Name or Si.No:");
           String option=in.nextLine().toUpperCase();
           removeBook(option);
       }     
       else if(ch.equals("4"))
       {             
           System.out.println("Enter the Book Name or Si.No:");
           String option=in.nextLine().toUpperCase();
           updateBook(option);
       }
       else  if(ch.equals("5")||ch.equals("exit")||ch.equals("0"))
       {
           break;
       }     
        }
    }
}

    




        
    

    

