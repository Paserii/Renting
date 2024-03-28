package src.java.model.db;

import java.util.ArrayList;
import java.util.List;

public class MotorcycleDAO {
    public MotorcycleDAO() {}

    public List<Motorcycle> createMotorcycle() {
        List<Motorcycle> motorcycles = new ArrayList<>();
        Motorcycle motorcycle1 = new Motorcycle("1", "BSA Gold Star", "BSA", true, 2001);
        motorcycles.add(motorcycle1);
        Motorcycle motorcycle2 = new Motorcycle("2","Series C Vincent Black Shadow ", "Vincent HRD", false, 2004);
        motorcycles.add(motorcycle2);
        Motorcycle motorcycle3 = new Motorcycle("3", "Manx Norton", "Manx", true, 2009);
        motorcycles.add(motorcycle3);
        Motorcycle motorcycle4 = new Motorcycle("4", "Velocette Venom", "Velocette", true, 2009);
        motorcycles.add(motorcycle4);
        Motorcycle motorcycle5 = new Motorcycle("5", "Metisse Desert Racer", "Metisse", false, 2007);
        motorcycles.add(motorcycle5);

        return motorcycles;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void listAllCars(List<Motorcycle> motorcycles) {
        for (int i = 0; i < motorcycles.size(); i++) {
            System.out.println(motorcycles.get(i));
        }
    }
}
