package org.example.JavaCertification;

import java.util.*;

public class ShapePoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape shape = new Shape(scanner.nextInt(), scanner.nextInt());
        shape.area();

        Rectangle rectangle = new Rectangle(scanner.nextInt(), scanner.nextInt());
        rectangle.area();
    }
}

class Shape{
    protected Integer l;
    protected Integer b;

    public Shape(Integer l, Integer b) {
        this.l = l;
        this.b = b;
    }

    public void area(){
        System.out.println(this.l + " "+ this.b);
    }
}

class Rectangle extends Shape{


    public Rectangle(Integer l, Integer b) {

        super(l, b);
    }
    @Override
    public void area() {
        System.out.println(super.l * super.b);
    }
}
