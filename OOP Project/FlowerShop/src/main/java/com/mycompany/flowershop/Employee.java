
package com.mycompany.flowershop;

public class Employee extends Person {
    
    private double salary;

    // Default Constructor 
    public Employee() {
        super();    // Name, Phone
        this.salary = 350;  
    }

    // Parametrizes Constructor
    public Employee(String name, String phone, double salary) {
        super(name, phone);
        this.salary = salary;
    }
    
    // Setter and Getter 
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else 
            this.salary = 350;
    }

    // Polymorphism
    @Override
    public String toString() {
        return super.toString() +
               "\nsalary=" + salary;
    }
}


