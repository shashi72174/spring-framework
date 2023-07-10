package com.package4;

interface Shape {
    public void draw();
}


class Circle implements Shape {
    public void draw() {
        System.out.println("drawing circle");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("drawing triangle");
    }
}

class Drawing {
    Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void drawMethod() {
        this.shape.draw();
    }
}


public class DrawShape {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        Shape shape2 = new Triangle();
        Shape shape1 = new Circle();

        drawing.setShape(shape1);
        drawing.drawMethod();

        drawing.setShape(shape2);
        drawing.drawMethod();
    }
}
