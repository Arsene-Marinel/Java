package com.company;

public class Sectiune {
    private String nume;
    private Carte carti[];

    public Sectiune(){}

    public Sectiune(String nume, Carte[] carti) {
        this.nume = nume;
        this.carti = carti;
    }

    public void setNume(String nume) { this.nume = nume; }
    public void setCarti(Carte[] carti) { this.carti = carti; }

    public String getNume() { return nume; }
    public Carte[] getCarti() { return carti; }

    @Override
    public String toString() {
        return nume;
    }
}
