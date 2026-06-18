package sessionsAssigment;

public class Main {
    static void main(String[] args) {
        Car car = new Car();
        car.honk();
        car.start();

        System.out.println("------------------------------------");

        Bike bike = new Bike();
        bike.ringBell();
        bike.start();
    }
}
