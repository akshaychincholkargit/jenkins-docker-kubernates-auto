package com.example.devapps.devapps.demo;

/**
 * The Laptop class represents a laptop with attributes such as brand, model, and price.
 * It provides constructors to initialize these attributes, getter and setter methods
 * to access and modify them, and a method to display the laptop's details.
 */
class Laptop {
            private String brand;
            private String model;
            private double price;

            // Constructor
            public Laptop(String brand, String model, double price) {
                this.brand = brand;
                this.model = model;
                this.price = price;
            }

            // Getter and Setter methods
            public String getBrand() {
                return brand;
            }

            public void setBrand(String brand) {
                this.brand = brand;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            // Display laptop details
            public void displayDetails() {
                System.out.println("Brand: " + brand);
                System.out.println("Model: " + model);
                System.out.println("Price: $" + price);
            }
        }