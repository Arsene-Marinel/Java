package com.company;

public class Angajat extends Persoana{
    private String adresa;
    private int numarOreZi;
    private int salariu;

    public Angajat() {}
    public Angajat(String nume, String prenume, String adresa, int numarOreZi, int salariu) {
        super(nume, prenume);
        this.adresa = adresa;
        this.numarOreZi = numarOreZi;
        this.salariu = salariu;
    }

    public void setAdresa(String adresa) { this.adresa = adresa; }
    public void setNumarOreZi(int numarOreZi) { this.numarOreZi = numarOreZi;}
    public void setSalariu(int salariu) { this.salariu = salariu; }

    public String getAdresa() { return adresa; }
    public int getNumarOreZi() { return numarOreZi; }
    public int getSalariu() { return salariu; }

    @Override
    public String toString() {
        return nume + " " + prenume;
    }
}
