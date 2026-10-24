package com.example.Tutone;

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct(String title, String description, double price) {
        super(Long.valueOf(title), description, price);
    }

    public PhysicalProduct(double weightKg, String dimensions) {
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
