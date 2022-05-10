package com.company;

/**
 * This class is used to initialize variables and to display results on the panel.
 */

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(10,"Brown");
        System.out.println(" Circumference = " + circle1.getCircumference() + "\n Circle square: " + circle1.getSquare() + "\n Colour = " + circle1.getColour());
    }
}
