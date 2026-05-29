package dayOne;
import java.util.Locale;
public class FirstJavaProgram {
    public static void main(String[] args){
        System.out.println("Hello Big Boy!");

        // comment line

        /*
            System.out.println("Hello Big Boy!");
         */
/*----------------------------------------------------------------------------------------------------------------*/

        // Variables
        // Declaration

        //DataType variableName = value; -> Initialization
       // String firstName = "Marwa"; //Store text into variables -> String can contain letters , numbers and special characters ""
//        String x = "2+2";
//        System.out.println(x);
//        String X = "10";
//        String Y = "15";
//        System.out.println(X + Y); //1015 -> concatenation -> combining two strings together

/*----------------------------------------------------------------------------------------------------------------*/

        // writing paragraph
//        String text = """
//                Hello
//                How are you?
//                I am learning Java.
//                """;
//
//        String secondText = "Hello\n"
//                + "How are you ?\n"
//                + "i am learning java 2";
//
//        System.out.println(text);
//        System.out.println(secondText);

/*----------------------------------------------------------------------------------------------------------------*/

        // Numbers
        // 1- int
//        int x =1 ;
//        int y = 2;
//        System.out.println(x +y);
//        System.out.println("Sum of x and y is: " + x + y); //problem number 2
//        System.out.println("Sum of x and y is: ");
//        System.out.println( x + y);

        // 2- float
//        float f = 12.09f;
//        System.out.println(f);

        // 3- double
//        double d =  55;
//        double l = 55.33;
//        System.out.println(d);
//        System.out.println(l);

/*----------------------------------------------------------------------------------------------------------------*/

        String firstName = "Yara";
        String lastName = "Mostafa";
        String fullName = firstName + " " + lastName; //concatenation -> combining two strings together
        int age = 19;
        String dateOfBirth = "20/05/2002";
        String job = "Testing engineer";
        double income = 10.5;
        double tax = income * 0.15; //15% tax
        double netSalary= income - tax;

        // print
        System.out.println(
             "Hello my name is: " + fullName
            + "\nMy age is: " + age
            + "\nMy Date of birth is: " + dateOfBirth
            + "\nMy job is: " + job
            + "\nMy income is: " + netSalary);

        System.out.println("----------------------------------------------------");

        System.out.printf(Locale.US,"Hello my name is: %s%n"
                + "My age is: %d%n"
                + "My Data of birth is: %s%n"
                + "My job is: %s%n"
                + "My income is: %f%n" , fullName , age , dateOfBirth , job , netSalary);
    }
}























