package com.company;

import com.company.Exceptions.WriteFileException;
import java.util.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class CititorService {
    Scanner scanner = new Scanner(System.in);
    static private List<Cititor> cititori = new ArrayList<>();

    public static List<Cititor> getCititori() {
        return cititori;
    }

    public static void setCititori(List<Cititor> cititori) { CititorService.cititori = cititori; }


    public void adaugaCititor() throws WriteFileException {
        System.out.println("Nume: ");
        String nume = scanner.nextLine();
        System.out.println("Prenume: ");
        String prenume = scanner.nextLine();
        System.out.println("Cod identificare: ");
        int codIdentificare = scanner.nextInt();
        System.out.println("Valabilitate permis: ");
        int valabilitatePermis = scanner.nextInt();
        System.out.println("Varsta: ");
        int varsta = scanner.nextInt();

        Cititor c = new Cititor(nume, prenume, codIdentificare, valabilitatePermis, varsta);
        cititori.add(c);
        System.out.println("Cititor adaugat");
        AngajatService.audit("newReader");
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
