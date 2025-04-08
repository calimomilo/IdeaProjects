package S3ex2;

public class Rectangle extends Shape {
    private double length;
    private double height;

    public Rectangle(String name, double length, double height) {
        super(name);
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return length*height;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length+height);
    }
}