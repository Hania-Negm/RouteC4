package dayThree;

import java.util.Scanner;

public class ConditionalStatements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Negative and positive numbers

//        System.out.println("Enter a number please");
//
//        int num = sc.nextInt();
//        if(num == 0){
//            System.out.println("The number is zero");
//        } else if (num < 0) {
//            System.out.println("The number is negative " + num);
//        }else {
//            System.out.println("The number is positive " + num);
//        }
/* -------------------------------------------------------------------------------------*/

//        Largest of 3 numbers

//        System.out.println("Enter your 1st number");
//        int num1 = sc.nextInt();;
//        System.out.println("Enter your 2nd number");
//        int num2 = sc.nextInt();
//        System.out.println("Enter your 3rd number");
//        int num3 = sc.nextInt();
//
//        if (num1 == num2 && num2 == num3) {
//            System.out.println("Three numbers cannot be equal");
//        } else if (num1 > num2 && num1 > num3) {
//            System.out.println("First number is the largest " + num1);
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println("Second number is the largest " + num2);
//        } else {
//            System.out.println("Third number is the largest " + num3);
//        }
/* ----------------------------------------------------------------------------------------*/

        //  Days of the week
//        System.out.println("Enter a number please");
//        int dayNum = sc.nextInt();
//
//        if(dayNum == 1)
//            System.out.println("Saturday");
//        else if(dayNum == 2)
//            System.out.println("Sunday");
//        else if(dayNum == 3)
//            System.out.println("Monday");
//        else if(dayNum == 4)
//            System.out.println("Tuesday");
//        else if(dayNum == 5)
//            System.out.println("Wednesday");
//        else if(dayNum == 6)
//            System.out.println("Thursday");
//        else if(dayNum == 7)
//            System.out.println("Friday");
//        else
//            System.out.println("Invalid input");


        // Better Solution
//        System.out.println("Enter a number please");
//        int dayNum = sc.nextInt();
//        switch (dayNum){
//            case 1 :
//                System.out.println("Saturday");
//                break;
//            case 2 :
//                System.out.println("Sunday");
//                break;
//            case 3 :
//                System.out.println("Monday");
//                break;
//            case 4 :
//                System.out.println("Tuesday");
//                break;
//            case 5 :
//                System.out.println("Wednesday");
//                break;
//            case 6 :
//                System.out.println("Thursday");
//                break;
//            case 7 :
//                System.out.println("Friday");
//                break;
//        }
/* ----------------------------------------------------------------------------------------*/

        System.out.println("Enter a name please");
        String dayName = sc.nextLine();
        switch (dayName){
            case "Saturday" :
                System.out.println(1);
                break;
            case "Sunday" :
                System.out.println(2);
                break;
            case "Monday" :
                System.out.println(3);
                break;
            case "Tuesday" :
                System.out.println(4);
                break;
            case "Wednesday" :
                System.out.println(5);
                break;
            case "Thursday" :
                System.out.println(6);
                break;
            case "Friday" :
                System.out.println(7);
                break;
        }
    }
}
