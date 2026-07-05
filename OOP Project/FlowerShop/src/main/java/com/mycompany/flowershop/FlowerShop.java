package com.mycompany.flowershop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowerShop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Flower Shop");
        System.out.println("===========================");

        // Flowers Number 
        System.out.print("How many flowers do you want to add? ");
        int count = input.nextInt();
        input.nextLine();

        // Flowers Data
        List<Flower> flowers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.println("\nFlower #" + (i + 1));
            Flower f = createFlower(input);
            flowers.add(f);
        }

        // Bouquet Name 
        System.out.println("=====Bouquet Name=====");
        Bouquet bouquet = createBouquet(input);
        // Customer Data
        System.out.println("=====Customer Data=====");
        Customer customer = createCustomer(input);
      
        for (int i = 0; i < flowers.size(); i++) {
            bouquet.addFlower(flowers.get(i));
        }

        customer.placeOrder(bouquet);

        displayOrder(customer);
    }

    public static Customer createCustomer(Scanner input) {
        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter phone number: ");
        String phone = input.nextLine();

        System.out.print("Enter address: ");
        String address = input.nextLine();

        return new Customer(name, phone, address);
    }

    public static Bouquet createBouquet(Scanner input) {
        System.out.print("Enter bouquet name: ");
        String bouquetName = input.nextLine();
        return new Bouquet(bouquetName);

    }

    public static Flower createFlower(Scanner input) {
        System.out.print("Enter flower name: ");
        String flowerName = input.nextLine();

        System.out.print("Enter flower color: ");
        String color = input.nextLine();

        System.out.print("Enter flower price: ");
        double price = input.nextDouble();
        input.nextLine();

        return new Flower(flowerName, color, price);
    }

    public static void displayOrder(Customer c) {
        System.out.println("\n=== Order Summary ===");
        System.out.println(c);

        List<Bouquet> orders = c.getOrders();
        for (int i = 0; i < orders.size(); i++) {
            Bouquet b = orders.get(i);
            System.out.println(b);
            System.out.println("Total Price: " + b.calculateTotalPrice() + " JD");
            System.out.println("Order under progress ");
        }
    }
}
