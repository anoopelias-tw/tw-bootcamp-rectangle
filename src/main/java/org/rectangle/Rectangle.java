package org.rectangle;

public class Rectangle {

    private final double length;
    private final double breadth;

    public static Rectangle square(double size) {
        return new Rectangle(size, size);
    }

    public static Rectangle rectangle(double length, double breadth) {
        return new Rectangle(length, breadth);
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
    public double perimeter() {
        return (length * 2) + (breadth * 2);
    }
}
