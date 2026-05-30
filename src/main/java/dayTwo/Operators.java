package dayTwo;

import java.util.Locale;

public class Operators {
    public static void main(String[] args) {
//        int x = 10;
//        int y = 20;
//        System.out.println(x == y); // false
//        System.out.println(x = y); // 20
//        System.out.println(x != y); // true
//        System.out.println("x = " + x); // 20
//        System.out.println(x == y); // false , now true

//        double a = 15.0;
//        int b = 15;
//        System.out.println(a == b);
//        System.out.println(a != b);

//        int a = 25;
//        System.out.println("The value of a is: " + a); // 25
//        int b = 25;
//        System.out.println("The sum of a and b is: " + (a + b)); // 50
//
//        a = a + 5;
//        a += 5; // shorthand assignment
//        System.out.println("The sum of a is: " + a);
//
//        a = a - 5;
//        a -= 5; // shorthand assignment
//        System.out.println("The sub of a is: " + a);
//
//        a = a * 5;
//        a *= 5; // shorthand assignment
//        System.out.println("The multi of a is: " + a);
//
//        a = a / 5;
//        a /= 5; // shorthand assignment
//        System.out.println("The div of a is: " + a);
//
//        System.out.printf(Locale.US,"The div of a is %d%n" , a);
//
//        int x = 31;
//        int y = 3;
//        System.out.println(x % y);

        // Relational Operators -> Binary

//        int a = 7;
//        int b = 5;
//        int c = 7;
//        int d = 7;
//        System.out.println(a > b); // T
//        System.out.println(a < b); // F
//        System.out.println(a == b); // F
//        System.out.println(a >= b); // T
//        System.out.println(a <= b); // F

        // Logical Operators -> Unary and Binary

//        boolean v1 = true;
//        boolean v2 = false;
//        System.out.println(v1 && v2); // AND => F
//        System.out.println(v1 || v2); // OR => T
//
//        System.out.println(a > b && b < c); // T
//                        //T         T
//
//        System.out.println(a > b && b > c); // F
//                        //T         F
//
//        System.out.println(a < b || d > a);// F
//                        //F        F
//        System.out.println(a <= b || d >= a);// T
//                        //F        T


//        int adbi = 20;
//        int almi = 15;
//        boolean tamioz = true;

//        if(adbi <= almi && tamioz){
//            System.out.println("ادخل ادبي");
//        } else {
//            System.out.println("ادخل علمي");
//        }

//        if(adbi >= almi && tamioz){
//            System.out.println("ادخل علمي");
//        } else{
//            System.out.println("ادخل ادبي");
//        }

        // Increment and Decrement Operators
//        int num = 10;
//        System.out.println(num++); // post increment => num + 1 then save in memory
//        System.out.println(num); // 11
//        System.out.println(++num); // 11 pre increment => increase num  then display
//
//        int number = 5;
//        System.out.println(number++); // 5
//        System.out.println(number); // 6
//        System.out.println(++number);// 7

        // Ternary Operators
        int a = 18, b = 10, c;
        c = (a > b) ? a : b; // if a > b then c = a , else c = b
        System.out.println("The largest value is " + c);


    }
}
