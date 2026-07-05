

package com.mycompany.flowershop;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private String address;
    private List<Bouquet> orders;

    // Default Construstor
    public Customer() {
        super();     // Name, Phone
        address = "Unknown";
        this.orders = new ArrayList<>(); 
    }

    // Parametrized Constructor 
    public Customer(String name, String phone, String address) {
        super(name, phone);
        setAddress(address);
        this.orders = new ArrayList<>();
    }

    // Setters and Getters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && !address.isEmpty()) {
            this.address = address;
        } else {
            this.address = "Unknown";
        }
    }

    public List<Bouquet> getOrders() {
        return orders;
    }

    public void setOrders(List<Bouquet> orders) {
        this.orders = orders;
    }
    
    // Adds a bouquet to the customer's list of orders (Aggregation relationship)
    public void placeOrder(Bouquet bouquet) {
            orders.add(bouquet);
    }
    
    
     // Polymorphism
    @Override
        public String toString() { 
                 return super.toString() + 
                        "\nAddress=" + address;}
}




