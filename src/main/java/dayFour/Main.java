package dayFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Sum s = new Sum();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int a = sc.nextInt();
//        System.out.println("Enter second number");
//        int b = sc.nextInt();
//        int result = s.sum(a,b);
//        System.out.println("Sum is :" + result);
//
//        System.out.println(s.sum(2,2));
//        System.out.println(s.sum(10,20));
//
//        hamada();
//    }
//
//    public static void hamada(){
//        System.out.println("HELLO , HAMADA");

        Rectangle r1 = new Rectangle();
        r1.setLength(5.5);
        r1.setWidth(5.5);
        double areaOfFirstRoom = r1.calcArea();
        System.out.println("The value of area od first room is :" + areaOfFirstRoom);
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());

        System.out.println("------------------------------------------------------------------------------");

        Rectangle r2 = new Rectangle();
        r2.setWidth(100.5);
        r2.setLength(100.5);
        double areaOfSecRoom = r2.calcArea();
        System.out.println("The value of area of second room is :" + areaOfSecRoom);
        System.out.println(r2.getWidth());
        System.out.println(r2.getLength());

        System.out.println("------------------------------------------------------------------------------");

        double totalArea = areaOfFirstRoom + areaOfSecRoom;
        System.out.println("The total area of both rooms is = " + totalArea);
    }
}
