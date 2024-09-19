package br.com.laparoscopia.dao;

import br.com.laparoscopia.model.Paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PacienteDAO {

    private Connection connection;

    public PacienteDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Paciente paciente) throws SQLException {
        String sql = "INSERT INTO PACIENTE (NOME, IDADE, CONDICAO) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, paciente.getNome());
            stmt.setInt(2, paciente.getIdade());
            stmt.setString(3, paciente.getCondicao());
            stmt.executeUpdate();
        }
    }

    public Paciente findByName(String nome) throws SQLException {
        String sql = "SELECT * FROM PACIENTE WHERE NOME = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Paciente(
                        rs.getString("NOME"),
                        rs.getInt("IDADE"),
                        rs.getString("CONDICAO")
                );
            }
        }
        return null;
    }

    public void update(Paciente paciente) throws SQLException {
        String sql = "UPDATE PACIENTE SET IDADE = ?, CONDICAO = ? WHERE NOME = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, paciente.getIdade());
            stmt.setString(2, paciente.getCondicao());
            stmt.setString(3, paciente.getNome());
            stmt.executeUpdate();
        }
    }

    public void delete(String nome) throws SQLException {
        String sql = "DELETE FROM PACIENTE WHERE NOME = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.executeUpdate();
        }
    }
}
