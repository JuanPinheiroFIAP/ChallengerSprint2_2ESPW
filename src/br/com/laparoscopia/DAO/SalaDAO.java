package br.com.laparoscopia.dao;

import br.com.laparoscopia.model.Sala;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalaDAO {

    private Connection connection;

    public SalaDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Sala sala) throws SQLException {
        String sql = "INSERT INTO SALA (NOME_SALA, NIVEL_DIFICULDADE) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, sala.getNome());
            stmt.setInt(2, sala.getNivelDificuldade());
            stmt.executeUpdate();
        }
    }

    public Sala findByName(String nome) throws SQLException {
        String sql = "SELECT * FROM SALA WHERE NOME_SALA = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Sala(
                        rs.getString("NOME_SALA"),
                        rs.getInt("NIVEL_DIFICULDADE")
                );
            }
        }
        return null;
    }

    public void update(Sala sala) throws SQLException {
        String sql = "UPDATE SALA SET NIVEL_DIFICULDADE = ? WHERE NOME_SALA = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, sala.getNivelDificuldade());
            stmt.setString(2, sala.getNome());
            stmt.executeUpdate();
        }
    }

    public void delete(String nome) throws SQLException {
        String sql = "DELETE FROM SALA WHERE NOME_SALA = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.executeUpdate();
        }
    }
}
