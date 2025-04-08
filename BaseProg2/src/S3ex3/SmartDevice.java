package S3ex3;

abstract class SmartDevice {
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public abstract void performFunction();
}