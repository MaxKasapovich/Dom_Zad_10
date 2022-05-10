package com.company;

/**
 * This class describes the circle's parameters (such as: radius, circumference, square and colour) and contains constructors to define them.
 */

public class Circle {

    private int radius;
    private int circumference;
    private int square;
    private String colour;

    public Circle(int radius) {
        this.radius = radius;
        circumference = (int) Math.round(2 * Math.PI * radius);
        square = (int) Math.round(Math.PI * radius * radius);
    }

    public Circle(int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
        circumference = (int) Math.round(2 * Math.PI * radius);
        square = (int) Math.round(Math.PI * radius * radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCircumference() {
        return circumference;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
