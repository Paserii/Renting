package src.java.engine;

import src.java.gui.GUI;
import src.java.model.db.Car;
import src.java.model.db.CarDAO;

import java.util.List;
import java.util.Scanner;

public class Engine {
    private GUI gui = new GUI();
    private Scanner scanner = new Scanner(System.in);

    public Engine() {}

    public void start() {
        boolean isRunning = true;

        // inicjalizacja DB
        CarDAO carDAO = new CarDAO();
        List<Car> cars = carDAO.createCars();

        switch (gui.showMenu()) {
            case 1:
                System.out.println("pojazdy ktore posiadamy: ");
                carDAO.listAllCars(cars);
                break;
            case 2:
                // wypozyczanie
                System.out.println("jaki typ pojazdu cie interesuje?");
                System.out.println("1. samochod");
                System.out.println("2. motor");



                int option2 = scanner.nextInt();

                System.out.println("Moja opcja: "+ option2);

                switch (option2) {
                    case 1:
                        System.out.println("nasze samochody terenowe: ");
                    case 2:
                        System.out.println("nasze samochody do miasta: ");
                    case 3:
                        System.out.println("nasze motory: ");
                }
                break;
            case 3:
                System.out.println("czy twoj pojazd zostal umieszczony w jednym z lokali?");
                System.out.println("tak/nie: ");

                Scanner option3 = new Scanner(System.in);
                String answer = option3.nextLine();

                if (answer.equals("tak")) {
                    System.out.println("okej, nasi pracownicy to sprawdza i zaakceptuja zwrot pojazdu");
                } else if (answer.equals("nie")) {
                    System.out.println("prosimy umiescic pojazd w jednym z salonow, a nastepnie skorzystac ze zwrotu ponownie");
                }
                break;
            default:
                System.out.println("Default case. Exiting program.");
                break;
                //case 4 wychodzi z programu
        }

    }
}
