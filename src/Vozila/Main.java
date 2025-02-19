package Vozila;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vozilo> vozila = new ArrayList<>();

        vozila.add(new Automobil("Mercedes-Benz", 215, 2));
        vozila.add(new Automobil("Citroen", 128, 4));
        vozila.add(new Bicikl("Trek",30, "Planinski"));
        vozila.add(new Bicikl("BMC",33, "Cestovni"));

        for (Vozilo voz : vozila) {
            System.out.println(voz.kretanje());
        }
    }
}
