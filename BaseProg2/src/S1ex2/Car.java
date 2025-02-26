package S1ex2;

public class Car {
    public String color;
    public String brand;
    public String model;
    public int year;
    public boolean isOn = false;
    public int speed = 0;

    public void turnOn() {
        isOn = true;
        showSpeed();
    }

    public void turnOff() {
        isOn = false;
        speed = 0;
        showSpeed();
    }

    public void accelerate(int a) {
        if (isOn) {
            speed += a;
            showSpeed();
        } else {
            System.out.println("Cette voiture est éteinte.");
        }
    }

    public void slow(int a) {
        if (speed != 0) {
            speed = speed > a ? speed - a : 0;
            showSpeed();
        } else {
            System.out.println("Cette voiture est déjà à l'arrêt.");
        }
    }

    public void showSpeed() {
        System.out.println("vitesse : " + speed + (speed == 0 ? " (" + (isOn ? "allumée" : "éteinte") + ")" : "") + "\n");
    }
}
