package Ucilica;

public class Krug {
    private double radijus;
    private String naziv;

    public Krug(double radijus, String naziv) {
        this.radijus = radijus;
        this.naziv = naziv;
    }

    //Opseg kruga
    public double Opseg() {
        return 2 * radijus * Math.PI;
    }

    //Površina kruga
    public double Povrsina() {
        return Math.pow(radijus,2) * Math.PI;
    }
}
