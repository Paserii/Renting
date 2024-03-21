package src.java.model.db;

public class Motorcycle {
    private String name;
    private String brand;
    private boolean rental;
    private int year;

    public Motorcycle(String name, String brand, boolean rental, int year) {
        this.name = name;
        this.brand = brand;
        this.rental = rental;
        this.year = year;
    }

    public Motorcycle() {}

    @Override
    public String toString() {
        return "Motorcycle = Name: " + name + " Brand: " + brand + " Is it available: " + rental + " Year of production: " + year;
    }

}


