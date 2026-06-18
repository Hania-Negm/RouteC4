package sessionsAssigment;

public class Bike extends Vehicle{

    public Bike(){
        super("Hano's Bike" , "Purple" , 2026);
    }

    public void ringBell(){
        System.out.println("This bike rings the bell");
    }

    @Override
    public void start(){
        System.out.println("Bike starts");
    }
}
