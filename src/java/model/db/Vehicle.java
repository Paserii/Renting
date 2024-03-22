package src.java.model.db;

public interface Vehicle {
    // 3 metody ktore: 1. wypisac pojazd jedzie 2. pojazd stoi. 3. pojazd jest wypozyczony

    void wziuuum();
    void stap();
    void taken();

    class whatdo implements Vehicle{
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
}
