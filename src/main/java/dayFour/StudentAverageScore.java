package dayFour;

import java.util.Scanner;

public class StudentAverageScore {
    static void main(String[] args) {
        int numberOfStudents = 3;
        int numberOfCourses = 4;
        Scanner scan = new Scanner(System.in);

        for (int i = 1 ; i <= numberOfStudents ; i++){
            int total = 0;
            for(int j = 1 ; j <= numberOfCourses ; j++){
                System.out.println("Enter score for course : " + j + " for student : " + i);
                double score = scan.nextDouble();
                total += score;
            }

            double average = total / numberOfCourses;
            System.out.println("The average score for student : " + i + " is " + average);
        }
    }
}
