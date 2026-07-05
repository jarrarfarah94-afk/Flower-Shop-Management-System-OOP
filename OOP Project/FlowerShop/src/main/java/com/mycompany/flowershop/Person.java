
package com.mycompany.flowershop;

public class Person {
    
    private String name;
    private String phone;

    // Default Constructor 
    public Person() {
        this.name = "Unknown";
        this.phone = "No Phone NO.";
    }

    // Parameterized Constructor
    public Person(String name, String phone) {
        setName(name);   //Encapsulation
        setPhone(phone);
    }

    // Setters and Getters 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = name;
        else
            this.name = "Unknown";
    }          

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.length() == 10)
           this.phone = phone;
        else 
           this.phone = "No Phone NO.";
    }

    // Polymorphisim
    @Override
    public String toString() {
        return "Name=" + name +
               "\nPhone=" + phone;
    }
}


