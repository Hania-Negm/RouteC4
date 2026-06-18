package dayFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sum s = new Sum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int result = s.sum(a,b);
        System.out.println("Sum is :" + result);

        System.out.println(s.sum(2,2));
        System.out.println(s.sum(10,20));

        hamada();
    }

    public static void hamada(){
        System.out.println("HELLO , HAMADA");
    }
}
