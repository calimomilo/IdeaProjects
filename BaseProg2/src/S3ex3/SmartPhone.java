package S3ex3;

public class SmartPhone extends SmartDevice {
    int batteryLevel;

    public SmartPhone(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void performFunction() {
        if (batteryLevel > 0 && super.isOn()) {
            System.out.println("Appel en cours");
        }
    }
}
