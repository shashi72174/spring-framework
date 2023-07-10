package com.package3;

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

class Drawing {

    public void drawMethod(Shape shape) {
        shape.draw();
    }
}

public class DrawShape {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        Shape shape1 = new Circle();
        Shape shape2 = new Triangle();

        drawing.drawMethod(shape1);
        drawing.drawMethod(shape2);
    }
}
