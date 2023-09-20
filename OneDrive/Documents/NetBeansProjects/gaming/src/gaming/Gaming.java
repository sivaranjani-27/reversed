package gaming;

import java.util.Scanner;
import java.util.Random;

public class Gaming {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random ra = new Random();

        int sara = 0, sanju = 0, karthi = 0;

        while (true) {
            System.out.print("Enter Your Name (sara/sanju/karthi/exit): ");
            String name = in.nextLine();
            if (name.equals("exit")) {
                break;
            }

            System.out.println("1-raja-2000\n2-rani-1000\n3-manthiri-500\n4-police-100");
            int val = ra.nextInt(4) + 1; 
            System.out.println(val);

            switch (val) {
                case 1: {
                    switch (name) {
                        case "sara":
                            sara += 2000;
                            break;
                        case "sanju":
                            sanju += 2000;
                            break;
                        case "karthi":
                            karthi += 2000;
                            break;
                    }
                    break;
                }

                case 2: {
                    switch (name) {
                        case "sara":
                            sara += 1000;
                            break;
                        case "sanju":
                            sanju += 1000;
                            break;
                        case "karthi":
                            karthi += 1000;
                            break;
                    }
                    break;
                }

                case 3: {
                    switch (name) {
                        case "sara":
                            sara += 500;
                            break;
                        case "sanju":
                            sanju += 500;
                            break;
                        case "karthi":
                            karthi += 500;
                            break;
                    }
                    break;
                }
                case 4: {
                    switch (name) {
                        case "sara":
                            sara += 100;
                            break;
                        case "sanju":
                            sanju += 100;
                            break;
                        case "karthi":
                            karthi += 100;
                            break;
                    }
                    break;
                }
            }

        }
        System.out.println("------------RESULT-----------");
        System.out.println("sara    : "+sara);
        System.out.println("Sanju  : " + sanju);
        System.out.println("karthi  : " + karthi);
        
    }

}
