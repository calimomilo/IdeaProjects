package S3ex3;

public class SmartWatch extends SmartDevice {
    private int stepCount = 0;

    public void walk(int steps) {
        stepCount += steps;
    }

    @Override
    public void performFunction() {
        System.out.println("Nombre de pas: " + stepCount);
    }
}
