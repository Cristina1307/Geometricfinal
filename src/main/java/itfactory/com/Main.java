package org.example;

import itfactory.com.Rectangle;
import itfactory.com.Shape;
import itfactory.com.Square;
import itfactory.com.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4, 5);
        Shape square = new Square(2);
        Rectangle rectangle = new Rectangle(3, 5);

        System.out.println("Perimeter of Triangle: " + triangle.calculatePerimeter());
        System.out.println("Perimeter of Square: " + square.calculatePerimeter());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
    }
}