package com.company;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<Integer, Autor> autori = new HashMap<>() {{
        put(1, new Autor("Creanga", "Ion", "naratiune", "Romania"));
        put(2, new Autor("Shakespeare", "William", "dramaturgie", "Anglia"));
        put(3, new Autor("Eminescu", "Mihai", "romantism", "Romania"));
    }};

    private Map<Integer, Carte> carti = new HashMap<>() {{
        put(1, new Carte("Amintiri din copilarie",
                new Autor("Creanga", "Ion", "naratiune", "Romania"), 1982));
        put(2, new Carte("Romeo si Julieta",
                new Autor("Shakespeare", "William", "dramaturgie", "Anglia"), 1597));
        put(3, new Carte("Luceafarul",
                new Autor("Eminescu", "Mihai", "romantism", "Romania"), 1883));
    }};

    private Map<Integer, Angajat> angajati = new HashMap<>() {{
        put(1, new Angajat("Popescu", "Valentina", "Mircea cel Batran", 8, 1850));
        put(2, new Angajat("Petrescu", "Radu", "Virtutii", 8, 2150));
        put(3, new Angajat("Gheorghe", "Maria", "Plaiul Independentei", 8, 2070));
    }};

    private Map<Integer, Cititor> cititori = new HashMap<>() {{
        put(1, new Cititor("Popescu", "Valentin", 3, 2, 44));
        put(2, new Cititor("Petrescu", "Raluca", 2, 5, 60));
        put(3, new Cititor("Gheorghe", "Marian", 1, 5, 25));
    }};

    public Map<Integer, Autor> getAutori() {
        return autori;
    }
    public Map<Integer, Carte> getCarti() {
        return carti;
    }
    public Map<Integer, Angajat> getAngajati() {
        return angajati;
    }
    public Map<Integer, Cititor> getCititori() {
        return cititori;
    }


    void addAutor(Autor a, Map<Integer, Autor> autori){
        autori.put(autori.size(), a);
    }
    void removeAutor(Map<Integer, Autor> autori, int nr) {
        autori.remove(nr);
    }
    void showAutori(Map<Integer, Autor> autori) {
        System.out.println(autori);
    }


    void addCarte(Carte c, Map<Integer, Carte> carti){
        carti.put(carti.size(), c);
    }
    void removeCarte(Map<Integer, Carte> carti, int nr) {
        carti.remove(nr);
    }
    void showCarti(Map<Integer, Carte> carti){
        System.out.println(carti);
    }


    void addAngajat(Angajat a, Map<Integer, Angajat> angajati){
        angajati.put(angajati.size(), a);
    }
    void removeAngajat(Map<Integer, Angajat> angajati, int nr) {
        angajati.remove(nr);
    }
    void showAngajati(Map<Integer, Angajat> angajati){
        System.out.println(angajati);
    }


    void addCititor(Cititor c, Map<Integer, Cititor> cititori){
        cititori.put(cititori.size(), c);
    }
    void removeCititor(Map<Integer, Cititor> cititori, int nr) {
        cititori.remove(nr);
    }
    void showCititori(Map<Integer, Cititor> cititori){
        System.out.println(cititori);
    }
}
