package com.company.repository;

import com.company.config.DatabaseConfiguration;
import com.company.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RepositoryUsingPreparedStatement {

    // angajat

    public void insertAngajat(int id, String nume, String prenume, String adresa, int numarOreZi, int salariu) {
        String insertAngajatSql = "INSERT INTO employees(id, nume, prenume, adresa," +
                " numarOreZi, salariu) VALUES(?, ?, ?, ?, ?, ?)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertAngajatSql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, nume);
            preparedStatement.setString(3, prenume);
            preparedStatement.setString(4, adresa);
            preparedStatement.setInt(5, numarOreZi);
            preparedStatement.setInt(6, salariu);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Angajat getAngajatById(int Id) {
        String selectSql = "SELECT * FROM employees WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setInt(1, Id);

            ResultSet resultSet = preparedStatement.executeQuery();
            return mapToAngajat(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateAngajatName(String nume, int id) {
        String updateNameSql = "UPDATE employees SET nume=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateNameSql);
            preparedStatement.setInt(2, id);
            preparedStatement.setString(1, nume);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Angajat mapToAngajat(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            return new Angajat(resultSet.getString(2), resultSet.getString(3),
                    resultSet.getString(4), resultSet.getInt(5), resultSet.getInt(6));
        }
        return null;
    }


    // autor

    public void insertAutor(int id, String nume, String prenume, String categorie, String nationalitate) {
        String insertAutorSql = "INSERT INTO authors(id, nume, prenume, categorie, nationalitate) VALUES(?, ?, ?, ?, ?)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertAutorSql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, nume);
            preparedStatement.setString(3, prenume);
            preparedStatement.setString(4, categorie);
            preparedStatement.setString(5, nationalitate);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Autor getAutorById(int Id) {
        String selectSql = "SELECT * FROM authors WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setInt(1, Id);

            ResultSet resultSet = preparedStatement.executeQuery();
            return mapToAutor(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateAutorName(String nume, int id) {
        String updateNameSql = "UPDATE authors SET nume=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateNameSql);
            preparedStatement.setString(1, nume);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Autor mapToAutor(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            return new Autor(resultSet.getString(2), resultSet.getString(3),
                    resultSet.getString(4), resultSet.getString(5));
        }
        return null;
    }


    // carte

    public void insertCarte(int id, String titlu, String autor, int anAparitie) {
        String insertCititorSql = "INSERT INTO books(id, titlu, autor, anAparitie) VALUES(?, ?, ?, ?)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertCititorSql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, titlu);
            preparedStatement.setString(3, autor);
            preparedStatement.setInt(4, anAparitie);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Carte getCarteById(int id) {
        String selectSql = "SELECT * FROM books WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            return mapToCarte(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateCarteName(String titlu, int id) {
        String updateNameSql = "UPDATE books SET titlu=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateNameSql);
            preparedStatement.setString(1, titlu);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Carte mapToCarte(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            return new Carte(resultSet.getString(2), resultSet.getString(3),
                    resultSet.getInt(4));
        }
        return null;
    }



    // cititor

    public void insertCititor(int id, String nume, String prenume, int codIdentificare, int valabilitatePermis, int varsta) {
        String insertCititorSql = "INSERT INTO readers(id, nume, prenume, codIdentificare, " +
                "valabilitatePermis, varsta) VALUES(?, ?, ?, ?, ?, ?)";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertCititorSql);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, nume);
            preparedStatement.setString(3, prenume);
            preparedStatement.setInt(4, codIdentificare);
            preparedStatement.setInt(5, valabilitatePermis);
            preparedStatement.setInt(6, varsta);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Cititor getCititorById(int id) {
        String selectSql = "SELECT * FROM readers WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            return mapToCititor(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateCititorName(String nume, int id) {
        String updateNameSql = "UPDATE readers SET nume=? WHERE id=?";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateNameSql);
            preparedStatement.setString(1, nume);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Cititor mapToCititor(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            return new Cititor(resultSet.getString(2), resultSet.getString(3),
                    resultSet.getInt(4), resultSet.getInt(5), resultSet.getInt(6));
        }
        return null;
    }
}
