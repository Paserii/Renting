package src.java.model.db;


public class Car implements Vehicle {

    // dodaj pole ID

    public void setRental(boolean rental) {
        this.rental = rental;
    }

    private String id;
    private String name;
    private String brand;
    private boolean rental;
    private int year;


    public Car(String id, String name, String brand, boolean rental, int year) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.rental = rental;
        this.year = year;
    }

    public Car() {}

    @Override
    public String toString() {
        return "Car = Name: " + name + " Brand: " + brand + " Is it available: " + rental + " Year of production: " + year;
    }

    //ID
    public String getId(){return id;}
    public void setId(String id) {this.id = id;}

    //NAME
    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}

    //BRAND
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    //RENTAL
    public boolean getRental(){return rental;}
    public void setRental(){this.rental = rental;}

    //YEAR
    public int getYear(){return year;}
    public void setYear(){this.year = year;}



    @Override
    public void wziuuum() {
        System.out.println("samochod jedzie");
    }

    @Override
    public void stap() {
        System.out.println("samochod stoi");
    }

    @Override
    public void taken() {
        System.out.println("samochod jest wynajety");
    }
}
