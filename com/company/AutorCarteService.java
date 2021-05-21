package com.company;

import com.company.Exceptions.WriteFileException;
import java.util.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class AutorCarteService {
    Scanner scanner = new Scanner(System.in);
    static private List<Autor> autori = new ArrayList<>();
    static private List<Carte> carti = new ArrayList<>();

    public static List<Autor> getAutori() { return autori; }
    public static List<Carte> getCarti() { return carti; }

    public static void setAutori(List<Autor> autori) {
        AutorCarteService.autori = autori;
    }
    public static void setCarti(List<Carte> carti) {
        AutorCarteService.carti = carti;
    }

    // autori
    public void adaugaAutor() throws WriteFileException {
        System.out.println("Nume: ");
        String nume = scanner.nextLine();
        System.out.println("Prenume: ");
        String prenume = scanner.nextLine();
        System.out.println("Categorie: ");
        String categorie = scanner.nextLine();
        System.out.println("Nationalitate: ");
        String nationalitate = scanner.nextLine();

        Autor a = new Autor(nume, prenume, categorie, nationalitate);
        autori.add(a);
        System.out.println("Angajat adaugat");
        AngajatService.audit("newAuthor");
    }

    public void afiseazaAutori() throws WriteFileException {
        int i = 1;
        for(Autor a : autori){
            System.out.println(i + ". " + a);
            i++;
        }
        AutorCarteService.audit("showAuthors");
    }


    // carti
    public void adaugaCarte() throws WriteFileException {
        System.out.println("Titlu: ");
        String titlu = scanner.nextLine();

        System.out.println("Autor:\nNume: ");
        String nume = scanner.nextLine();
        System.out.println("Prenume: ");
        String prenume = scanner.nextLine();
        System.out.println("Categorie: ");
        String categorie = scanner.nextLine();
        System.out.println("Nationalitate: ");
        String nationalitate = scanner.nextLine();

        System.out.println("An aparitie: ");
        int anAparitie = scanner.nextInt();

        Carte c = new Carte(titlu, new Autor(nume, prenume, categorie, nationalitate), anAparitie);
        carti.add(c);
        System.out.println("Carte adaugata");
        AngajatService.audit("newBook");
    }

    public void afiseazaCarti() throws WriteFileException {
        afiseazaAutori();
        System.out.println("\nIndexul autorului: ");
        int i = 1;
        System.out.println("Carti: ");
        for (Carte c : carti) {
            System.out.println(i + ". " + c);
            i++;
        }
        AutorCarteService.audit("showBooks");
    }


    public static void audit(String action) throws WriteFileException {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter("src/com/company/Files/audit.txt", true))) {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String text = action + ", " + timestamp + '\n';
            buffer.write(text);
        } catch (IOException e) {
            throw new WriteFileException("Ceva nu a mers bine in metoda writeUsingBufferedWriter", e);
        }
    }
}
