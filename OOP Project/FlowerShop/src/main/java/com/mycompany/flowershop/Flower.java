
package com.mycompany.flowershop;

public class Flower {

    private String name;
    private String color;
    private double price;

    // Default Constructor
    public Flower() {
        this.name = "Unknown";
        this.color = "Unknown";
        this.price = 0.0;
    }

    // Parametrized Constructor
    public Flower(String name, String color, double price) {
        setName(name);
        setColor(color);
        setPrice(price);
    }
    
     // Setters and Getters 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "Unknown";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
            this.price = price;
        }
    

    // Polymorphism
    @Override
    public String toString() {
        return "Name=" + name +
               "\nColor=" + color +
               "\nPrice=" + price;
    }
}


