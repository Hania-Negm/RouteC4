package dayTwo;

import java.util.Scanner;

public class SmartOfficeController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int temp;
        int sum = 0;
        int ecoHours = 0;
        boolean overHeating = false;

        for (int i = 1; i <= 8; i++) {

            System.out.println("Enter your current office temperature!");
            temp = sc.nextInt();

            sum += temp;

            if (temp >= 30) {
                overHeating = true;
            }

            if (temp > 26) {
                System.out.println("AC ON");
            } else if (temp >= 20 && temp <= 26) {
                System.out.println("AC ECO");
                ecoHours++;
            } else {
                System.out.println("AC OFF");
            }
        }

        double average = (double) sum / 8;

        System.out.println("SUMMARY REPORT");
        System.out.println("The average temp through 8 hours: " + average);
        System.out.println("ECO HOURS: " + ecoHours);

        if (overHeating) {
            System.out.println("Alert: Severe Overheating!");
        }
    }
}