package daySix;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike starts by wheeling");
    }

    @Override
    public void stop(){
        System.out.println("Bike stops with a kick");
    }
}
