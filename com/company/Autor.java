package com.company;

public class Autor extends Persoana {
    private String categorie;
    private String nationalitate;

    public Autor(){
        this.categorie = "";
        this.nationalitate = "";
    }

    public Autor(String nume, String prenume, String categorie, String nationalitate){
        super(nume, prenume);
        this.categorie = categorie;
        this.nationalitate = nationalitate;
    }

    public void setCategorie(String categorie) { this.categorie = categorie; }
    public void setNationalitate(String nationalitate) { this.nationalitate = nationalitate; }

    public String getCategorie() { return categorie; }
    public String getNationalitate() { return nationalitate; }

    @Override
    public String toString() {
        return nume + " " + prenume + " " + nationalitate;
    }
}
