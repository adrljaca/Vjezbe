package Ucilica;

public class Krug {
    private double radijus;

    public Krug(double radijus) {
        this.radijus = radijus;
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
