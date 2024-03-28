package src.java.gui;

import java.util.Scanner;

public class GUI {

    private final Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\nwybierz opcje\n");
        System.out.println("""
                1. pojazdy dostepne w bazie
                2. wyporzyczenie pojazdu
                3. oddanie pojazdu
                4. Exit""");
        int option = scanner.nextInt();

        System.out.println("Moja opcja: " + option);

        return option;
    }
}
