package com.company;

/**
 * This class describes the pizzas' parameters (such as: basis, composition, name and price) and contains constructors to work with them.
 */

public class Pizza {

    private Circle basis;
    private String composition;
    private String name;
    private double price;

    public Pizza(String composition, String name, double price, int diameter) {
        this.composition = composition;
        this.name = name;
        this.price = price;
        Circle circle = new Circle(diameter/2);
        basis = circle;
    }

    public Circle getBasis() {
        return basis;
    }

    public void setBasis(Circle basis) {
        this.basis = basis;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
