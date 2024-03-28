package src.java.model.db;

import java.util.ArrayList;
import java.util.List;

public class CarDAO {

    //
    public CarDAO() {}

    public List<Car> createCars() {
        List<Car> cars = new ArrayList<>();
        // dodaj do listy 5 samochodow i je wypisz
        Car car1 = new Car("0","Ford Falcon","Ford Austrailia",true, 2002);
        cars.add(car1);
        Car car2 = new Car("1","Toyota Hilux","Toyota",false,2012);
        cars.add(car2);
        Car car3 = new Car("2","Volkswagen Gol","Volkswagen",false,2018);
        cars.add(car3);
        Car car4 = new Car("3","Fiat Uno", "Fiat", true, 2006);
        cars.add(car4);
        Car car5 = new Car("4","SEAT ibiza", "SEAT", false, 2003);
        cars.add(car5);


        return cars;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void listAllCars(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }

    // metoda do wypozyczenia auta rental = false
    public void rentCar(int id, List<Car> cars) {

        // sprawdzenie czy jest jest wypozyczony jak jest wyswietl odpowidnia informacje a jak sie uda to tez
        cars.get(id).setRental(false);

        System.out.println("Car rented successfully.");
    }

    // stworz metode do oddania samochodu
}
