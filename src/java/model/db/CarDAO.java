package src.java.model.db;

import java.util.ArrayList;
import java.util.List;

public class CarDAO {

    //

    public List<Car> CarDAO() {
        List<Car> cars = new ArrayList<>();
        // dodaj do listy 5 samochodow i je wypisz
        Car car1 = new Car("Ford Falcon", "Ford Austrailia", "2002");
        cars.add(car1);


        return cars;
    }

}
