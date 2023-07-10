package com.package1;

class Circle {
    public void draw() {
        System.out.println("drawing circle");
    }
}

class Triangle {
     public void draw() {
         System.out.println("drawing triangle");
     }
}


public class DrawShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        Triangle t = new Triangle();
        t.draw();
    }
}
