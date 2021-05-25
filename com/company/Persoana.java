package com.company;

public abstract class Persoana {
    String nume, prenume;

    Persoana(){}   // constructor
    public Persoana(String nume, String prenume) {        // constructor parametrizat
        this.nume    = nume;
        this.prenume = prenume;
    }

    public void setNume(String nume) { this.nume = nume; }
    public void setPrenume(String prenume) { this.prenume = prenume; }

    public String getNume() { return nume; }
    public String getPrenume() { return prenume; }

    @Override
    public String toString() {
        return nume + " " + prenume;
    }
}