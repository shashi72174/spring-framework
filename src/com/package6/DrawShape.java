package com.package6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

abstract class Shape {
    public abstract void draw();
}


class Triangle extends Shape {

    String type;
    List<String> list;

    public Triangle() {
        System.out.println("triangle no arg constructor called");
    }

    public Triangle(String type, List<String> list) {
        System.out.println("triangle 2 args constructor called");
        this.type = type;
        this.list = list;
    }

    public Triangle(String type) {
        System.out.println("triangle 1 arg constructor called");
        this.type = type;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        System.out.println("type setter method called");
        this.type = type;
    }

    @Override
    public void draw() {
        System.out.println("drawing triangle of type "+getType() +" list values are "+getList());
    }
}

class Circle extends Shape {

    public Circle() {
        System.out.println("circle constructor called");
    }
    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}


class Drawing {
    Shape shape;

    public Drawing() {
        System.out.println("drawing constructor called");
    }

    public Drawing(Shape shape) {
        this.shape = shape;
    }

    @Required
    @Autowired
    public void setShape(Shape shape) {
        System.out.println("shape setter method called");
        this.shape=shape;
    }

    public void drawShape() {
        shape.draw();
    }
}

public class DrawShape {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdrawingapp-beans.xml");
        Drawing drawing1 = (Drawing) applicationContext.getBean("drawing");
        //Drawing drawing2 = (Drawing) applicationContext.getBean("drawing");
        //System.out.println(drawing1==drawing2);
        //System.out.println(drawing1.hashCode()+" "+drawing2.hashCode());
        drawing1.drawShape();
        //drawing2.drawShape();
        /*MyConfiguration myConfiguration = (MyConfiguration) applicationContext.getBean("myConfiguration");
        System.out.println("myConfiguration hashcode "+myConfiguration.hashCode());
        TestBean testBean = (TestBean) applicationContext.getBean("testBean");
        System.out.println("testbean hashcode "+testBean.hashCode());
        System.out.println(testBean.getX());*/


        MyClass myClass = (MyClass) applicationContext.getBean("myClass");


    }
}
