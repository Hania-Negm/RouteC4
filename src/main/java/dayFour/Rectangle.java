package dayFour;

import java.util.Scanner;

public class Rectangle {
   // Scanner sc = new Scanner(System.in);

    private double width;
    private   double length;

    public void setLength(double length){
        if(length > 0){
            this.length = length;
        } else {
            System.out.println("Length must be positive");
        }
    }

//    public void setLength(double length){
//        System.out.println("Enter your length please of your first room !");
//        if(length > 0){
//            this.length = sc.nextDouble();
//        } else {
//            System.out.println("Length must be positive");
//        }
//    }

    public  double getLength(){
        return length;
    }

    public void setWidth(double width){
        if(width > 0){
            this.width = width;
        } else {
            System.out.println("Width must be positive");
        }
    }

//    public void setWidth(double width){
//        System.out.println("Enter your width please of your first room !");
//        if(width > 0){
//            this.width = sc.nextDouble();
//        } else {
//            System.out.println("Width must be positive");
//        }
//    }

    public double getWidth(){
        return width;
    }

    public  double calcArea(){
        return getLength() * getWidth();
    }

/*-------------------------------------------------------------------------------------------------------- */
//    public double calcArea(){
//        System.out.println("Enter length");
//        length = sc.nextDouble();
//        System.out.println("Enter width");
//        width = sc.nextDouble();
//        double area = length * width;
//        System.out.println("The area of rectangle is : " + area);
//        return area;
//    }
}
