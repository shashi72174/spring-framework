package com.package2;

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("drawing triangle");
    }
}

public class DrawShape {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Triangle();

        shape1.draw();
        shape2.draw();
    }
}
