package com.company.FileService;

import com.company.*;
import com.company.Exceptions.WriteFileException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToFileService {
    // scrierea unui angajat in fisier
    public static void writeAngajat(List<Angajat> angajati) throws WriteFileException {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter("src/com/company/Files/angajati.txt"))) {
            for(Angajat a : angajati) {
                String text = a.getNume() + ", " + a.getPrenume() + ", " + a.getAdresa()
                        + ", " + a.getNumarOreZi() + ", " + a.getSalariu() + '\n';
                buffer.write(text);
            }
        } catch (IOException e) {
            throw new WriteFileException("Ceva nu mers bine in metoda writeAngajat", e);
        }
    }

    // scrierea unui autor in fisier
    public static void writeAutor(List<Autor> autori) throws WriteFileException {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter("src/com/company/Files/autori.txt"))) {
            for(Autor a : autori) {
                String text = a.getNume() + ", " + a.getPrenume() + ", " + a.getCategorie()
                        + ", " + a.getNationalitate() + '\n';
                buffer.write(text);
            }
        } catch (IOException e) {
            throw new WriteFileException("Ceva nu mers bine in metoda writeAutor", e);
        }
    }

    // scrierea unei carti in fisier
    public static void writeCarte(List<Carte> carti) throws WriteFileException {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter("src/com/company/Files/carti.txt"))) {
            for(Carte c : carti) {
                String text = c.getTitlu() + ", " + c.getAutor() + ", " + c.getAnAparitie() + '\n';
                buffer.write(text);
            }
        } catch (IOException e) {
            throw new WriteFileException("Ceva nu mers bine in metoda writeCarte", e);
        }
    }

    // scrierea unui cititor in fisier
    public static void writeCititor(List<Cititor> cititori) throws WriteFileException {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter("src/com/company/Files/cititori.txt"))) {
            for(Cititor c : cititori) {
                String text = c.getNume() + ", " + c.getPrenume() + ", " + c.getCodIdentificare()
                        + ", " + c.getValabilitatePermis() + ", " + c.getVarsta() + '\n';
                buffer.write(text);
            }
        } catch (IOException e) {
            throw new WriteFileException("Ceva nu mers bine in metoda writeCititor", e);
        }
    }
}
