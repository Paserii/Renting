package src.java;

import src.java.model.db.Car;
import src.java.model.db.Motorcycle;
import src.java.model.db.Vehicle;

public class Main{
    public static void main(String[] args){

        // konstruktor pusty:
        Car car = new Car();

        // instancje samochodu bmw:


        Car bmw = new Car("Samochod Basi", "BMW", false, 2019);

        Motorcycle motorcycle = new Motorcycle();

        Motorcycle kawasaki = new Motorcycle("motor szymona", "Kawasaki", true, 2024);
        Motorcycle motorcycle1 = new Motorcycle("motor szymona", "Kawasaki", true, 2024);


        // Zmien (setter) brand  motorcycle1 na Honda i wypisz tego branda (getter)
        System.out.println(bmw);
        System.out.println(kawasaki);

        motorcycle1.setBrand("Honda");
        System.out.println(motorcycle1.getBrand());

        whatdo mycar =


    }

}



