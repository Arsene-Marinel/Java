package com.company;

import java.util.*;

public class Services {
    Scanner scanner = new Scanner(System.in);
    Biblioteca b = new Biblioteca();


    // Adauga carte
    public void addCarte(){
        System.out.println("Titlu: ");
        String titlu = scanner.nextLine();
        System.out.println("Autor: ");
        String nume = scanner.nextLine();
        String prenume = scanner.nextLine();
        String categorie = scanner.nextLine();
        String nationalitate = scanner.nextLine();
        Autor autor = new Autor(nume, prenume, categorie, nationalitate);
        System.out.println("An aparitie: ");
        int anAparitie = scanner.nextInt();
        scanner.nextLine();
        Carte carte = new Carte(titlu, autor, anAparitie);

        b.addCarte(carte, b.getCarti());
    }

    // Sterge carte
    public void removeBook() {
        System.out.println("Introduceti a cata carte din cele existente dorita sa stergeti");
        int nr = scanner.nextInt();
        b.removeCarte(b.getCarti(), nr);
    }

    // Afisare carte
    public void showBooks() {
        b.showCarti(b.getCarti());
    }



    // Adauga autor
    public void addAuthor(){
        System.out.println("Autor: ");
        String nume = scanner.nextLine();
        String prenume = scanner.nextLine();
        String categorie = scanner.nextLine();
        String nationalitate = scanner.nextLine();
        Autor autor = new Autor(nume, prenume, categorie, nationalitate);
        b.addAutor(autor, b.getAutori());
    }

    // Stergere autori
    public void removeAuthor() {
        System.out.println("Introduceti al catalea autor din cei existenti dorita sa stergeti");
        int nr = scanner.nextInt();
        b.removeAutor(b.getAutori(), nr);
    }

    // Afisare autori
    public void showAuthors() {
        b.showAutori(b.getAutori());
    }


    // Adauga angajat
    public void addEmployee(){
        System.out.println("Nume si prenume: ");
        String nume = scanner.nextLine();
        String prenume = scanner.nextLine();
        System.out.println("Adresa: ");
        String adresa = scanner.nextLine();
        System.out.println("Numar ore de munca pe zi: ");
        int numarOreZi = scanner.nextInt();
        System.out.println("Salariu: ");
        int salariu = scanner.nextInt();

        Angajat angajat = new Angajat(nume, prenume, adresa, numarOreZi, salariu);
        b.addAngajat(angajat, b.getAngajati());
    }

    // Stergere angajat
    public void removeEmployee() {
        System.out.println("Introduceti al catalea angajat din cei existenti dorita sa fie concediat");
        int nr = scanner.nextInt();
        b.removeAngajat(b.getAngajati(), nr);
    }

    // Afisare angajati
    public void showEmplyees() {
        b.showAngajati(b.getAngajati());
    }


    // Adauga cititor
    public void addReader(){
        System.out.println("Nume si prenume: ");
        String nume = scanner.nextLine();
        String prenume = scanner.nextLine();
        System.out.println("Cod de identificare: ");
        int codIdentificare = scanner.nextInt();
        System.out.println("Valabilitate permis: ");
        int valabilitatePermis = scanner.nextInt();
        System.out.println("Varsta: ");
        int varsta = scanner.nextInt();

        Cititor cititor = new Cititor(nume, prenume, codIdentificare, valabilitatePermis, varsta);
        b.addCititor(cititor, b.getCititori());
    }

    // Stergere cititor
    public void removeReader() {
        System.out.println("Introduceti al catalea cititor din cei existenti dorita sa fie eliminat");
        int nr = scanner.nextInt();
        b.removeCititor(b.getCititori(), nr);
    }

    // Afisare cititor
    public void showReaders() {
        b.showCititori(b.getCititori());
    }

}
