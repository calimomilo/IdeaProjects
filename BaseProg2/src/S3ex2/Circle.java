package S3ex2;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}