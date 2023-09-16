package switchcase1;

import java.util.Scanner;

public class Switchcase1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        System.out.println("Enter age:");
        age = in.nextInt();
        int msg = age > 18?1:2;

        switch (msg) {
            case 1: {
                System.out.println("you are eligible");
                break;
            }
            case 2: {
                System.out.println(" you are not eligible");
                break;
            }
        }
    }
