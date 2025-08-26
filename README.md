# 🚗 Car Rental System

A console-based Car Rental System developed in Java to enhance and practice Object-Oriented Programming (OOP) concepts.
This project allows customers to view available cars, rent cars, return them, and calculate rental costs.

## ✨ Features

👤 User Management – Customers can register/login

🚘 Car Management – Add, remove, view available cars

🛒 Car Rental Service – Rent and return cars

💰 Billing System – Calculates rental charges based on duration

🔄 OOP Concepts – Classes, Objects, Inheritance, Polymorphism, Encapsulation

## 🛠️ Tech Stack

Language: Java

Database: (Optional) File Handling or ArrayList/Collections for data storage

IDE: Eclipse / IntelliJ / NetBeans


## 📌 Sample Workflow

Display Available Cars

Show list of cars with model, brand, price per day.

Customer Chooses a Car

Enter car ID and rental days.

System Generates Bill

Calculate total cost = (price × days).

Return Car

Update availability.

🧑‍💻 Example Code Snippet
// Car.java
public class Car {
    private int id;
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean available;

    public Car(int id, String brand, String model, double pricePerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rentCar() {
        available = false;
    }

    public void returnCar() {
        available = true;
    }

    @Override
    public String toString() {
        return id + " - " + brand + " " + model + " ($" + pricePerDay + "/day) " 
               + (available ? "Available" : "Rented");
    }
}

## 🚀 Getting Started
1. Clone Repository
git clone https://github.com/<your-username>/car-rental-system.git

2. Compile & Run
cd car-rental-system/src
javac Main.java
java Main

## 🎯 OOP Concepts Covered

Encapsulation – private fields, getters/setters

Inheritance – Customer and Admin roles (if extended)

Polymorphism – Overriding methods for billing/discounts

Abstraction – Service classes handling operations


👤 Author

Samrudh KU.
