package com.company;

import java.util.*;

import com.company.config.DatabaseConfiguration;
import com.company.repository.RepositoryUsingPreparedStatement;
import com.company.repository.RepositoryUsingStatements;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Services services = new Services();
    //static AngajatService angajatService = new AngajatService();
    //static AutorCarteService autorCarteService = new AutorCarteService();
    //static CititorService cititorService = new CititorService();

    public static void main(String[] args) throws Exception {
        RepositoryUsingStatements personRepositoryUsingStmt = new RepositoryUsingStatements();

        // angajati

        personRepositoryUsingStmt.createTableAngajat();
        //personRepositoryUsingStmt.addAngajat();
        //personRepositoryUsingStmt.deleteAngajat();
        //personRepositoryUsingStmt.displayAngajat();

        RepositoryUsingPreparedStatement repositoryUsingPreparedStmt = new RepositoryUsingPreparedStatement();
        //Angajat angajat = repositoryUsingPreparedStmt.getAngajatById(5);
        //System.out.println("Nume = " + angajat.getNume());

        //repositoryUsingPreparedStmt.updateAngajatName("Ion", 5);
        //Angajat updatedAngajat = repositoryUsingPreparedStmt.getAngajatById(5);
        //System.out.println("Nume = " + updatedAngajat.getNume());

        //repositoryUsingPreparedStmt.insertAngajat(6,"Arsene", "Marinel", "Pitesti", 0, 0);
        //Angajat insertedAngajat = repositoryUsingPreparedStmt.getAngajatById(6);
        //System.out.println("Nume = " + insertedAngajat.getNume());




        // autori

        personRepositoryUsingStmt.createTableAutor();
        //personRepositoryUsingStmt.addAutor();
        //personRepositoryUsingStmt.deleteAutor();
        //personRepositoryUsingStmt.displayAutor();

        /*Autor autor = repositoryUsingPreparedStmt.getAutorById(5);
        System.out.println("Nume = " + autor.getNume());

        repositoryUsingPreparedStmt.updateAutorName("SHakespear", 5);
        Autor updatedAutor = repositoryUsingPreparedStmt.getAutorById(5);
        System.out.println("Nume = " + updatedAutor.getNume());

        repositoryUsingPreparedStmt.insertAutor(6,"Arghezi", "Tudor", "poezie", "roman");
        Autor insertedAutor = repositoryUsingPreparedStmt.getAutorById(6);
        System.out.println("Nume = " + insertedAutor.getNume());
         */


        // carti

        personRepositoryUsingStmt.createTableCarte();
        //personRepositoryUsingStmt.addCarte();
        //personRepositoryUsingStmt.deleteCarte();
        //personRepositoryUsingStmt.displayCarte();

        /*
        Carte carte = repositoryUsingPreparedStmt.getCarteById(5);
        System.out.println("Titlu = " + carte.getTitlu());

        repositoryUsingPreparedStmt.updateCarteName("LUceafarul", 5);
        Carte updatedCarte = repositoryUsingPreparedStmt.getCarteById(5);
        System.out.println("Titlu = " + updatedCarte.getTitlu());

        repositoryUsingPreparedStmt.insertCarte(6,"Arsene", "Marinel",  2021);
        Carte insertedCarte = repositoryUsingPreparedStmt.getCarteById(6);
        System.out.println("Nume = " + insertedCarte.getTitlu());
        */


        //cititori
        personRepositoryUsingStmt.createTableCititor();
        //personRepositoryUsingStmt.addCititor();
        //personRepositoryUsingStmt.deleteCititor();
        //personRepositoryUsingStmt.displayCititor();

        /*Cititor cititor = repositoryUsingPreparedStmt.getCititorById(5);
        System.out.println("Nume = " + cititor.getNume());

        repositoryUsingPreparedStmt.updateCititorName("MUstata", 5);
        Cititor updatedCititor = repositoryUsingPreparedStmt.getCititorById(5);
        System.out.println("Nume = " + updatedCititor.getNume());

        repositoryUsingPreparedStmt.insertCititor(6,"Arsene", "Marinel", 126, 3, 21);
        Cititor insertedCititor = repositoryUsingPreparedStmt.getCititorById(6);
        System.out.println("Nume = " + insertedCititor.getNume());
         */


        DatabaseConfiguration.closeDatabaseConnection();

        /*
        // angajati
        List<Angajat> angajati = ReadToFileService.readAngajat();
        angajatService.setAngajati(angajati);
        angajatService.adaugaAngajat();
        WriteToFileService.writeAngajat(angajatService.getAngajati());

        // autori si carti
        List<Autor> autori = ReadToFileService.readAutor();
        autorCarteService.setAutori(autori);
        autorCarteService.adaugaAutor();
        WriteToFileService.writeAutor(autorCarteService.getAutori());

        List<Carte> carti = ReadToFileService.readCarte(autori);
        autorCarteService.setCarti(carti);
        autorCarteService.adaugaCarte();
        autorCarteService.afiseazaCarti();
        WriteToFileService.writeCarte(autorCarteService.getCarti());

        // cititori
        List<Cititor> cititori = ReadToFileService.readCititor();
        cititorService.setCititori(cititori);
        cititorService.adaugaCititor();
        WriteToFileService.writeCititor(cititorService.getCititori());


        boolean exit = false;
        while (!exit) {
            System.out.println("\n0. Exit\n1. Carti\n2. Autori\n3. Angajati\n4. Cititori");
            System.out.println("Please, choose a number:");
            int nr = scanner.nextInt();
            switch (nr) {
                case 0:
                    exit = true;
                    System.out.println("Exit!");
                    break;
                case 1:
                    System.out.println("1.Adaugare carte\n2.Stergere carte\n3.Afisare carti");
                    int nr1 = scanner.nextInt();
                    switch (nr1) {
                        case 1:
                            services.addCarte();
                            break;
                        case 2:
                            services.removeBook();
                            break;
                        case 3:
                            services.showBooks();
                            break;
                        default:
                            System.out.println("Introduceti un numar corespunzator :)");
                            break;
                    }
                case 2:
                    System.out.println("1.Adaugare autor\n2.Stergere autor\n3.Afisare autori");
                    int nr2 = scanner.nextInt();
                    switch (nr2) {
                        case 1:
                            services.addAuthor();
                            break;
                        case 2:
                            services.removeAuthor();
                            break;
                        case 3:
                            services.showAuthors();
                            break;
                        default:
                            System.out.println("Introduceti un numar corespunzator :)");
                            break;
                    }
                case 3:
                    System.out.println("1.Adaugare angajat\n2.Stergere angajat\n3.Afisare angajati");
                    int nr3 = scanner.nextInt();
                    switch (nr3) {
                        case 1:
                            services.addEmployee();
                            break;
                        case 2:
                            services.removeEmployee();
                            break;
                        case 3:
                            services.showEmplyees();
                            break;
                        default:
                            System.out.println("Introduceti un numar corespunzator :)");
                            break;
                    }
                case 4:
                    System.out.println("1.Adaugare cititor\n2.Stergere cititor\n3.Afisare cititor");
                    int nr4 = scanner.nextInt();
                    switch (nr4) {
                        case 1:
                            services.addReader();
                            break;
                        case 2:
                            services.removeReader();
                            break;
                        case 3:
                            services.showReaders();
                            break;
                        default:
                            System.out.println("Introduceti un numar corespunzator :)");
                            break;
                    }
                default:
                    System.out.println("Introduceti un numar corespunzator :)");
                    break;
            }
        }

         */
    }
}
