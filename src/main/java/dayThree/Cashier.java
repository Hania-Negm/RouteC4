package dayThree;

import java.util.Scanner;

public class Cashier {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items");
        int itemQuantity = sc.nextInt();
        double total = 0;
        for (int i = 0 ; i < itemQuantity ; i++){
            System.out.println("Enter the price of item " + i);
            double itemPrice = sc.nextDouble();
            total += itemPrice;
        }

        System.out.println("The total price is : " + total);
    }
}
