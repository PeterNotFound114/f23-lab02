package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * getWidth() * getHeight() / 4.0;
    }

    public double getWidth() {
        return 2.0 * this.radius;
    }

    public double getHeight() {
        return 2.0 * this.radius;
    }
}
