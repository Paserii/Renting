package src.java;

import src.java.engine.Engine;
import src.java.model.db.Car;
import src.java.model.db.CarDAO;
import src.java.model.db.Motorcycle;
import src.java.model.db.Vehicle;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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

        kawasaki.taken();


        // wypisz liste samochodow z klasy CarDAO;
        //List <Car> cars = car;
        //car = new cars();
        //for (int i = 0; i < cars.size(); i++) {
        //    System.out.println(cars.get(i));



        // robimy engine

        Engine engine = new Engine();
        engine.start();
    }


}



