package Ucilica;

public class Trokut {
    private double a,b,c;
    private String naziv;

    public Trokut(double a, double b, double c, String naziv) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.naziv = naziv;
    }

    //Opseg trokuta
    public double Opseg() {
        return a + b + c;
    }

    //Površina trokuta - Heronova formula
    public double Povrsina() {
        double s = Opseg() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
