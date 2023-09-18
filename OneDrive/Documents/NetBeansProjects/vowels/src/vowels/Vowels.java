package vowels;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        char ch;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter:");
        ch = in.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("ans:\n" + ch + " is vowel");
        } else {
            System.out.println("ans:\n" + ch + " is consonant");
        }

    }
}



