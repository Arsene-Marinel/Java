package com.company;

public class Carte {
    private String titlu;
    private Autor autor;
    private int anAparitie;

    public Carte() {
        this.titlu = "";
        this.autor = new Autor();
        this.anAparitie = 0;
    }

    public Carte(String titlu, Autor autor, int anAparitie) {
        this.titlu = titlu;
        this.autor = autor;
        this.anAparitie = anAparitie;
    }

    public void setTitlu(String titlu) { this.titlu = titlu; }
    public void setAutor(Autor autor) { this.autor = autor; }
    public void setAnAparitie(int anAparitie) { this.anAparitie = anAparitie; }

    public String getTitlu() { return titlu; }
    public Autor getAutor() { return autor; }
    public int getAnAparitie() { return anAparitie; }

    @Override
    public String toString() {
        return  "Cartea cu titlul " + titlu +
                " scrisa de " + autor +
                " in anul " + anAparitie;
    }
}
