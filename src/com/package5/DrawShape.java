package com.package5;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import java.io.File;

class Circle {
    public void draw() {
        System.out.println("drawing circle");
    }
}

class Triangle {

    public Triangle() {
        System.out.println("triangle constructor called");
    }
    public void draw() {
        System.out.println("drawing triangle");
    }
}


public class DrawShape {
    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource(new File("drawingapp-beans.xml")));
        //Triangle triangle = (Triangle) beanFactory.getBean("triangle");
        Triangle triangle = beanFactory.getBean(Triangle.class);
        triangle.draw();

        Circle circle = (Circle) beanFactory.getBean("circle");
        circle.draw();
    }
}
