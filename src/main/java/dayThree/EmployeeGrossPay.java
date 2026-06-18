package dayThree;

import java.util.Scanner;
import java.util.Locale;
public class EmployeeGrossPay {
    static void main(String[] args) {
        double hourRate = 15;
        int weeklyWorkingHours = 40;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Enter your weekly working hours");
        double employeeWorkingHours = sc.nextDouble();

        while (employeeWorkingHours > weeklyWorkingHours || employeeWorkingHours <= 0){
            System.out.println("Invalid input : Re-enter your working hours");
            System.out.println("Enter your weekly working hours");
            employeeWorkingHours = sc.nextDouble();
        }

        double salary = employeeWorkingHours * hourRate;
        System.out.println("Your growth salary is : " + salary + "$");
    }
}
