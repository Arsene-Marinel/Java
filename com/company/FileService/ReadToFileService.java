package com.company.FileService;

import com.company.*;
import com.company.Exceptions.ReadFileException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadToFileService {
    // metoda pentru citirea angajatilor din fisier
    // fisierul este de forma: nume, prenume, adresa, numar de ore lucratoare pe zi, salariu
    public static List<Angajat> readAngajat() throws ReadFileException {
        List<Angajat> angajati = new ArrayList<>();
        try (BufferedReader bufferAngajat = new BufferedReader(new FileReader("src/com/company/Files/angajati.txt"))) {
            String lineAngajat = bufferAngajat.readLine();
            while (lineAngajat != null) {
                Angajat a = new Angajat();
                String[] infoAngajat = lineAngajat.split(",");
                a.setNume(infoAngajat[0]);
                a.setPrenume(infoAngajat[1]);
                a.setAdresa(infoAngajat[2]);
                a.setNumarOreZi(Integer.parseInt(infoAngajat[3]));
                a.setSalariu(Integer.parseInt(infoAngajat[4]));

                angajati.add(a);
                lineAngajat = bufferAngajat.readLine();
            }

            return angajati;
        } catch (IOException e) {
            throw new ReadFileException("Ceva nu mers bine in metoda readAngajat", e);

        }
    }


    // metoda pentru citirea autorilor din fisier
    // fisierul este de forma: nume, prenume, categorie, nationalitate
    public static List<Autor> readAutor() throws ReadFileException {
        List<Autor> autori = new ArrayList<>();
        try (BufferedReader bufferAutor = new BufferedReader(new FileReader("src/com/company/Files/autori.txt"))) {
            String lineAutor = bufferAutor.readLine();
            while (lineAutor != null) {
                Autor a = new Autor();
                String[] infoAutor = lineAutor.split(",");
                a.setNume(infoAutor[0]);
                a.setPrenume(infoAutor[1]);
                a.setCategorie(infoAutor[2]);
                a.setNationalitate(infoAutor[3]);

                autori.add(a);
                lineAutor = bufferAutor.readLine();
            }

            return autori;
        } catch (IOException e) {
            throw new ReadFileException("Ceva nu mers bine in metoda readAutor", e);

        }
    }


    // Cand citim cartile atribuim fiecaruia autorul
    // metoda pentru citirea cartilor din fisier
    // fisierul este de forma: titlu, autor, an aparitie
    public static List<Carte> readCarte(List<Autor> autori) throws ReadFileException {
        List<Carte> carti = new ArrayList<>();
        try (BufferedReader bufferCarte = new BufferedReader(new FileReader("src/com/company/Files/carti.txt"))) {
            String lineCarte = bufferCarte.readLine();
            while (lineCarte != null) {
                Carte c = new Carte();
                String[] infoCarte = lineCarte.split(",");
                c.setTitlu(infoCarte[0]);

                for (Autor a : autori) {
                    if (a.getNume().equals(infoCarte[1])) {
                        c.setAutor(a);
                    }
                }

                c.setAnAparitie(Integer.parseInt(infoCarte[2]));

                carti.add(c);
                lineCarte = bufferCarte.readLine();
            }

            return carti;
        } catch (IOException e) {
            throw new ReadFileException("Ceva nu mers bine in metoda readCarte", e);

        }
    }


    // metoda pentru citirea cititorilor din fisier
    // fisierul este de forma: nume, prenume, codIdentificare, valabilitatePermis, varsta
    public static List<Cititor> readCititor() throws ReadFileException {
        List<Cititor> cititori = new ArrayList<>();
        try (BufferedReader bufferCititor = new BufferedReader(new FileReader("src/com/company/Files/cititori.txt"))) {
            String lineCititor = bufferCititor.readLine();
            while (lineCititor != null) {
                Cititor c = new Cititor();
                String[] infoCititor = lineCititor.split(",");
                c.setNume(infoCititor[0]);
                c.setPrenume(infoCititor[1]);
                c.setCodIdentificare(Integer.parseInt(infoCititor[2]));
                c.setValabilitatePermis(Integer.parseInt(infoCititor[3]));
                c.setVarsta(Integer.parseInt(infoCititor[4]));

                cititori.add(c);
                lineCititor = bufferCititor.readLine();
            }

            return cititori;
        } catch (IOException e) {
            throw new ReadFileException("Ceva nu mers bine in metoda readCititor", e);

        }
    }
}
