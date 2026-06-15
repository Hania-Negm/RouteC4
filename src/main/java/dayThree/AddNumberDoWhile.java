package dayThree;

import java.util.Scanner;
import java.util.Locale;

public class AddNumberDoWhile {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        do{
            System.out.println("Enter your first number");
            int num1 = sc.nextInt();

            System.out.println("Enter your second number");
            int num2 = sc.nextInt();

            int sum = num1 + num2;

            System.out.println("The sum is : " + sum);
            System.out.println("If you want to continue write true or false");

            flag = sc.nextBoolean();

            if(flag == false){
                System.out.println("Thank you for using program");
            }
        }
        while (flag);
    }
}
