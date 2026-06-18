package sessionsAssigment;

public class Vehicle {
    String brand;
    String color;
    int year;

    public Vehicle(String brand ,String color , int year){
        this.brand = brand;
        this.color = color;
        this.year = year;
        System.out.println("Brand is : " + brand + " the color : " + color + " created in : " + year);
    }

    public void start(){
        System.out.println("Vehicle starts");
    }
}
