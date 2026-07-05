
package com.mycompany.flowershop;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    
    // Attributes 
    private String bouquetName;
    private List<Flower> flowers;  //Composition

    
    // Default Constructor
    public Bouquet() {
        this.bouquetName = "Unknown";
        this.flowers = new ArrayList<>(); 
    }
    
    // Parametrized Constructor 
    public Bouquet(String bouquetName) {
    this.bouquetName = bouquetName;
    this.flowers = new ArrayList<>();
       }

    // Setters and Getters 
    public String getBouquetName() {
        return bouquetName;
    }

    public void setBouquetName(String bouquetName) {
        this.bouquetName = bouquetName;
    }

    // Method to add flowers to the bouquet
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    // Method to Claculate flowers Price
    public double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < flowers.size(); i++) {
            total += flowers.get(i).getPrice();
        }
        return total;
    }

    //Polymorphism
    @Override
    public String toString() {
        return "Bouquet Name=" + bouquetName;
    }
}


