package diapat;

import java.util.Scanner;
public class Diapat {

        public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int r = in.nextInt();

        if (r % 2 == 0) {
            System.out.println("Please enter an odd number of rows.");
            return;
        }

        int sp = r / 2;
        int stars = 1;

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i <= r / 2) {
                sp--;
                stars += 2;
            } else {
                sp++;
                stars -= 2;
            }
        }
    }
    }
    
}
