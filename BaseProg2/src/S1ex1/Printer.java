package S1ex1;

public class Printer {
    public boolean isOn = false;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean getIsOn() {
        System.out.println("Cette imprimante est " + (isOn? "allumée." : "éteinte."));
        return isOn;
    }
}
