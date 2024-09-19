package br.com.laparoscopia.dao;

import br.com.laparoscopia.model.Procedimento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProcedimentoDAO {

    private Connection connection;

    public ProcedimentoDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Procedimento procedimento) throws SQLException {
        String sql = "INSERT INTO PROCEDIMENTO (TIPO_PROCEDIMENTO, DURACAO) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, procedimento.getTipo());
            stmt.setInt(2, procedimento.getDuracao());
            stmt.executeUpdate();
        }
    }

    public Procedimento findByType(String tipo) throws SQLException {
        String sql = "SELECT * FROM PROCEDIMENTO WHERE TIPO_PROCEDIMENTO = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, tipo);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Procedimento(
                        rs.getString("TIPO_PROCEDIMENTO"),
                        rs.getInt("DURACAO")
                );
            }
        }
        return null;
    }

    public void update(Procedimento procedimento) throws SQLException {
        String sql = "UPDATE PROCEDIMENTO SET DURACAO = ? WHERE TIPO_PROCEDIMENTO = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, procedimento.getDuracao());
            stmt.setString(2, procedimento.getTipo());
            stmt.executeUpdate();
        }
    }

    public void delete(String tipo) throws SQLException {
        String sql = "DELETE FROM PROCEDIMENTO WHERE TIPO_PROCEDIMENTO = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, tipo);
            stmt.executeUpdate();
        }
    }
}
