package br.com.laparoscopia.dao;

import br.com.laparoscopia.model.Equipamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EquipamentoDAO {
    private Connection connection;

    // Construtor que recebe uma conexão com o banco de dados
    public EquipamentoDAO(Connection connection) {
        this.connection = connection;
    }

    // Método para inserir um novo equipamento
    public void insert(Equipamento equipamento) throws SQLException {
        String sql = "INSERT INTO EQUIPAMENTO (ID_EQUIPAMENTO, NOME_EQUIPAMENTO, DESCRICAO, EM_USO) VALUES (EQUIPAMENTO_SEQ.NEXTVAL, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, equipamento.getNomeEquipamento());
            stmt.setString(2, equipamento.getDescricao());
            stmt.setString(3, equipamento.isEmUso() ? "S" : "N");
            stmt.executeUpdate();
            System.out.println("Equipamento inserido com sucesso.");
        }
    }

    // Método para buscar um equipamento pelo nome
    public Equipamento findByName(String nomeEquipamento) throws SQLException {
        String sql = "SELECT * FROM EQUIPAMENTO WHERE NOME_EQUIPAMENTO = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nomeEquipamento);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("NOME_EQUIPAMENTO");
                    String descricao = rs.getString("DESCRICAO");
                    boolean emUso = rs.getString("EM_USO").equals("S");
                    return new Equipamento(nome, descricao);
                }
            }
        }
        System.out.println("Equipamento não encontrado.");
        return null;
    }

    // Método para atualizar o status de uso do equipamento
    public void updateUso(Equipamento equipamento) throws SQLException {
        String sql = "UPDATE EQUIPAMENTO SET EM_USO = ? WHERE NOME_EQUIPAMENTO = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, equipamento.isEmUso() ? "S" : "N");
            stmt.setString(2, equipamento.getNomeEquipamento());
            stmt.executeUpdate();
            System.out.println("Status de uso do equipamento atualizado.");
        }
    }

    // Método para deletar um equipamento pelo nome
    public void delete(String nomeEquipamento) throws SQLException {
        String sql = "DELETE FROM EQUIPAMENTO WHERE NOME_EQUIPAMENTO = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nomeEquipamento);
            stmt.executeUpdate();
            System.out.println("Equipamento deletado com sucesso.");
        }
    }
}
