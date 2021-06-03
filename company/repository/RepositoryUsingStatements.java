package com.company.repository;

import com.company.Autor;
import com.company.config.DatabaseConfiguration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RepositoryUsingStatements {
    Scanner scanner = new Scanner(System.in);

    // angajati

    public void createTableAngajat() {
        String createTableSql = "CREATE TABLE IF NOT EXISTS employees" +
                "(id int PRIMARY KEY AUTO_INCREMENT, nume varchar(45), prenume varchar(45), " +
                "adresa varchar(60), numarOreZi int, salariu int)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            stmt.execute(createTableSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addAngajat() {
        System.out.println("Nume: ");
        String Nume = scanner.nextLine();
        System.out.println("Prenume: ");
        String Prenume = scanner.nextLine();
        System.out.println("Adresa: ");
        String Adresa = scanner.nextLine();
        System.out.println("Numar ore de munca pe zi: ");
        int NumarOreZi = scanner.nextInt();
        System.out.println("Salariu: ");
        int Salariu = scanner.nextInt();
        System.out.println("Id: ");
        int Id = scanner.nextInt();

        String insertAngajatSql = "INSERT INTO employees(id, nume, prenume, adresa, " + "numarOreZi, salariu) " +
                "VALUES('" + Id + "', '" + Nume + "', '" + Prenume + "', '" + Adresa + "', '"
                + NumarOreZi + "', '" + Salariu + "')";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(insertAngajatSql); // returns no of altered lines
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayAngajat() {
        String selectSql = "SELECT * FROM employees";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectSql);
            while (resultSet.next()) {
                System.out.println("Nume:" + resultSet.getString(2));
                System.out.println("Prenume: " + resultSet.getString(3));
                System.out.println("Adresa: " + resultSet.getString(4));
                System.out.println("Numarul de ore lucratoare pe zi: " + resultSet.getInt(5));
                System.out.println("Salariu: " + resultSet.getInt(6) + "\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAngajat(){
        System.out.println("Sterge angajatul cu Id=");
        int Id = scanner.nextInt();
        String deleteSql = "DELETE FROM employees WHERE id = '" + Id + "'";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement st = connection.createStatement();
            st.executeUpdate(deleteSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    // autor

    public void createTableAutor() {
        String createTableSql = "CREATE TABLE IF NOT EXISTS authors" +
                "(id int PRIMARY KEY AUTO_INCREMENT, nume varchar(45), prenume varchar(45), " +
                "categorie varchar(60), nationalitate varchar(60))";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            stmt.execute(createTableSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addAutor() {
        System.out.println("Nume: ");
        String Nume = scanner.nextLine();
        System.out.println("Prenume: ");
        String Prenume = scanner.nextLine();
        System.out.println("Categorie: ");
        String Categorie = scanner.nextLine();
        System.out.println("Nationalitate: ");
        String Nationalitate = scanner.nextLine();
        System.out.println("Id: ");
        int Id = scanner.nextInt();

        String insertAutorSql = "INSERT INTO authors(id, nume, prenume, categorie, nationalitate) " +
                "VALUES('" + Id + "', '" + Nume + "', '" + Prenume + "', '" + Categorie + "', '"
                + Nationalitate + "')";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(insertAutorSql); // returns no of altered lines
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayAutor() {
        String selectSql = "SELECT * FROM authors";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectSql);
            while (resultSet.next()) {
                System.out.println("Nume:" + resultSet.getString(2));
                System.out.println("Prenume: " + resultSet.getString(3));
                System.out.println("Categoria: " + resultSet.getString(4));
                System.out.println("Nationalitate: " + resultSet.getString(5) + "\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAutor(){
        System.out.println("Sterge autorul cu Id=");
        int Id = scanner.nextInt();
        String deleteSql = "DELETE FROM authors WHERE id = '" + Id + "'";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement st = connection.createStatement();
            st.executeUpdate(deleteSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    // carte

    public void createTableCarte() {
        String createTableSql = "CREATE TABLE IF NOT EXISTS books" +
                "(id int PRIMARY KEY AUTO_INCREMENT, titlu varchar(45), autor varchar(280), anAparitie int)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            stmt.execute(createTableSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addCarte() {
        System.out.println("Titlu: ");
        String Titlu = scanner.nextLine();
        System.out.println("Nume autor: ");
        String Nume = scanner.nextLine();
        System.out.println("Prenume autor: ");
        String Prenume = scanner.nextLine();
        System.out.println("Categorie autor: ");
        String Categorie = scanner.nextLine();
        System.out.println("Nationalitate autor: ");
        String Nationalitate = scanner.nextLine();
        System.out.println("Anul aparitiei: ");
        int AnAparitie = scanner.nextInt();
        System.out.println("Id: ");
        int Id = scanner.nextInt();

        String autor = new Autor(Nume, Prenume, Categorie, Nationalitate).toString();

        String insertAutorSql = "INSERT INTO books(id, titlu, autor, anAparitie) " +
                "VALUES('" + Id + "', '" + Titlu + "', '" + autor + "', '" + AnAparitie + "')";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(insertAutorSql); // returns no of altered lines
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayCarte() {
        String selectSql = "SELECT * FROM books";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectSql);
            while (resultSet.next()) {
                System.out.println("Titlu:" + resultSet.getString(2));
                System.out.println("Autor:" + resultSet.getString(3));
                System.out.println("Anul Aparitiei: " + resultSet.getString(4) + "\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCarte(){
        System.out.println("Sterge cartea cu Id=");
        int Id = scanner.nextInt();
        String deleteSql = "DELETE FROM books WHERE id = '" + Id + "'";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement st = connection.createStatement();
            st.executeUpdate(deleteSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    // cititor

    public void createTableCititor() {
        String createTableSql = "CREATE TABLE IF NOT EXISTS readers" +
                "(id int PRIMARY KEY AUTO_INCREMENT, nume varchar(45), prenume varchar(45), " +
                "codIdentificare int, valabilitatePermis int, varsta int)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            stmt.execute(createTableSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addCititor() {
        System.out.println("Nume: ");
        String Nume = scanner.nextLine();
        System.out.println("Prenume: ");
        String Prenume = scanner.nextLine();
        System.out.println("Cod identificare: ");
        int CodIdentificare = scanner.nextInt();
        System.out.println("Valabilitate permis: ");
        int ValabilitatePermis = scanner.nextInt();
        System.out.println("Varsta: ");
        int Varsta = scanner.nextInt();
        System.out.println("Id: ");
        int Id = scanner.nextInt();

        String insertCititorSql = "INSERT INTO readers(id, nume, prenume, codIdentificare, valabilitatePermis, varsta) " +
                "VALUES('" + Id + "', '" + Nume + "', '" + Prenume + "', '" + CodIdentificare + "', '"
                + ValabilitatePermis + "', '" + Varsta + "')";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(insertCititorSql); // returns no of altered lines
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayCititor() {
        String selectSql = "SELECT * FROM readers";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(selectSql);
            while (resultSet.next()) {
                System.out.println("Nume:" + resultSet.getString(2));
                System.out.println("Prenume: " + resultSet.getString(3));
                System.out.println("Cod Identificare: " + resultSet.getInt(4));
                System.out.println("Valabilitatea permisului: " + resultSet.getInt(5) + " luni");
                System.out.println("Varsta: " + resultSet.getInt(6) + "\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCititor(){
        System.out.println("Sterge cititorul cu Id=");
        int Id = scanner.nextInt();
        String deleteSql = "DELETE FROM readers WHERE id = '" + Id + "'";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try{
            Statement st = connection.createStatement();
            st.executeUpdate(deleteSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
