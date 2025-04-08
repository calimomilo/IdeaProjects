package S3ex2;

abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName() + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter());
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
