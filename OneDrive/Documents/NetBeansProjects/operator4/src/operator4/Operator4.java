package operator4;

public class Operator4 {

    public static void main(String[] args) {
        
        //bitwise
        int a = 10, b = 2;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 2);
        System.out.println(a >> 2);
        //ternary
        int age=18;
        String msg=(age>18)?"can vote":"cannot vote";
        System.out.println(msg);

        
        int c=10;
        c&=2;
        System.out.println(c);
                
      
    }

}
