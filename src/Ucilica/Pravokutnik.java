package Ucilica;

public class Pravokutnik {
    private double sirina,duljina;
    private String naziv;

    public Pravokutnik(double sirina, double duljina, String naziv) {
        this.sirina = sirina;
        this.duljina = duljina;
        this.naziv = naziv;
    }

    //Opseg pravokutnika
    public double Opseg () {
        return 2 * (sirina + duljina);
    }

    //Površina pravokutnika
    public double Povrsina() {
        return sirina * duljina;
    }
}
