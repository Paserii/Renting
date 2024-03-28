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
        Motorcycle motorcycle = new Motorcycle();

        // robimy engine

        Engine engine = new Engine();
        engine.start();
    }


}



