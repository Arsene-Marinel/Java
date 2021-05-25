package com.company;

import com.company.Exceptions.WriteFileException;
import java.util.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class AngajatService {
    Scanner scanner = new Scanner(System.in);
    static private List<Angajat> angajati = new ArrayList<>();

    public static List<Angajat> getAngajati() {
        return angajati;
    }

    public static void setAngajati(List<Angajat> angajati) {
        AngajatService.angajati = angajati;
    }


    public void adaugaAngajat() throws WriteFileException {
        System.out.println("Nume: ");
        String nume = scanner.nextLine();
        System.out.println("Prenume: ");
        String prenume = scanner.nextLine();
        System.out.println("Adresa: ");
        String adresa = scanner.nextLine();
        System.out.println("Numar ore de munca pe zi: ");
        int numarOreZi = scanner.nextInt();
        System.out.println("Salariu: ");
        int salariu = scanner.nextInt();

        Angajat a = new Angajat(nume, prenume, adresa, numarOreZi, salariu);
        angajati.add(a);
        System.out.println("Angajat adaugat");
        AngajatService.audit("newEmployee");
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
