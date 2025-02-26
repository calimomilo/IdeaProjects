package S1ex2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate(10);
        car.turnOn();
        car.accelerate(20);
        car.slow(15);
        car.slow(10);
        car.slow(5);
        car.accelerate(30);
        car.turnOff();
    }
}
