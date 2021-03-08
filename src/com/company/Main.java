package com.company;

import org.w3c.dom.css.Rect;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Rectangle r1 =new Rectangle(4);
        Rectangle r2 =new Rectangle(4,8);
        Rectangle r3 =new Rectangle(6,4);

        System.out.println("Фигура 1");
        r1.calculateArea();
        r1.printArea();
        r1.printRectangleKind();
        System.out.println(r1.isTheSameRectangle(r2));
        System.out.println(r1.isTheSameRectangle(r3));

        System.out.println("Фигура 2");
        r2.calculateArea();
        r2.printArea();
        r2.printRectangleKind();
        System.out.println(r2.isTheSameRectangle(r1));
        System.out.println(r2.isTheSameRectangle(r3));

        System.out.println("Фигура 3");
        r3.calculateArea();
        r3.printArea();
        r3.printRectangleKind();
        System.out.println(r3.isTheSameRectangle(r2));
        System.out.println(r3.isTheSameRectangle(r1));

        r3.printRectanglesCount();

        r1.printClassName(true);
        r1.printClassName(false);

    }
}