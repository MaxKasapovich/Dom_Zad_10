package com.company;

/**
 * This class defines the array of pizzas, contains methods to work with them and to display results on the panel.
 */

public class Pizzeria {

    public static Pizza[] pizzas = new Pizza[3];

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("dough, tomatoes, cheese, chilli pepper", "Diavola", 66, 36);
        Pizza pizza2 = new Pizza("dough, cheese, salmon, sea bass", "Fish", 67, 38);
        Pizza pizza3 = new Pizza("dough, mozzarella, shrimp, mussels", "Mare", 68, 40);
        pizzas[0] = pizza1;
        pizzas[1] = pizza2;
        pizzas[2] = pizza3;

        for (int i = 0; i < pizzas.length; i++) {
            System.out.println("Pizza " + (i+1) + ": ");
            System.out.println("Name: "+ pizzas[i].getName() + "\nComposition: " + pizzas[i].getComposition() + "\nPrice = " + pizzas[i].getPrice());
            System.out.println("Diameter = " + (pizzas[i].getBasis().getRadius()*2) + "\nCircumference = " + pizzas[i].getBasis().getCircumference() + "\nSquare = " + pizzas[i].getBasis().getSquare());
        }
    }
}
