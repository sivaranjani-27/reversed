package pattern1;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = in.nextInt();
        System.out.println("Enter the number of columns:");
        int columns=in.nextInt();
        for (int i = 0; i <= rows; i++) 
        {
            for (int j = 0; j <= columns; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= rows; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}
