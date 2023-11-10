package word;

import java.util.Scanner;

public class word {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the letter to be reversed:");
        String input = in.nextLine();

        String reversedletter = reverseString(input);
        System.out.println("Reversed letter: " + reversedletter);
    }

    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
}
