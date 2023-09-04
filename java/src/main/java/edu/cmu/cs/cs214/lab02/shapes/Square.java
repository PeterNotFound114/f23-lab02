package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private final double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    public double getArea() {
        return this.getWidth() * this.getHeight(); // should I call function like this?
    }

    public double getWidth() {
        return this.sideLen;
    }

    public double getHeight() {
        return this.sideLen;
    }
}
