package Vozila;

public abstract class Vozilo {
    private String marka;
    private double brzina;

    //Konstruktor
    public Vozilo(String marka, double brzina) {
        this.marka = marka;
        this.brzina = brzina;
    }

    //Getteri
    public String getMarka() {
        return marka;
    }

    public double getBrzina() {
        return brzina;
    }

    public abstract String kretanje();
}
