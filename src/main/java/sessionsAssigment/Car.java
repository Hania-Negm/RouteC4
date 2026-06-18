package sessionsAssigment;

public class Car extends Vehicle{

    public  Car(){
        super("BMW" , "Black" ,2026);
    }

    public void honk(){
        System.out.println("This car honks Beeeeeeeeeeeep!");
    }

    @Override
    public void start(){
        System.out.println("Car starts");
    }
}
