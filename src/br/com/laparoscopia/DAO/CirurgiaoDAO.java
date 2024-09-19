package br.com.laparoscopia.dao;

import br.com.laparoscopia.model.Cirurgiao;
import br.com.laparoscopia.model.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CirurgiaoDAO {

    private Connection connection;

    public CirurgiaoDAO(Connection connection) {
        this.connection = connection;
    }

    // Método para inserir um cirurgião no banco de dados
    public void insert(Cirurgiao cirurgiao) throws SQLException {
        String sql = "INSERT INTO CIRURGIAO (NOME_MEDICO, EXPERIENCIA, ESPECIALIDADE, IDADE, HOSPITAL, NIVEL_HABILIDADE, CATEGORIA_ID) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cirurgiao.getNome_medico());
            stmt.setInt(2, cirurgiao.getExperiencia());
            stmt.setString(3, cirurgiao.getEspecialidade());
            stmt.setInt(4, cirurgiao.getIdade());
            stmt.setString(5, cirurgiao.getHospital());
            stmt.setInt(6, cirurgiao.getNivelHabilidade());
            stmt.setInt(7, cirurgiao.getCategoria().ordinal() + 1); // Envia o índice da enum Categoria

            stmt.executeUpdate();
        }
    }

    // Método para buscar um cirurgião pelo nome
    public Cirurgiao findByName(String nome_medico) throws SQLException {
        String sql = "SELECT * FROM CIRURGIAO WHERE NOME_MEDICO = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome_medico);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Cirurgiao(
                        rs.getString("NOME_MEDICO"),
                        rs.getInt("EXPERIENCIA"),
                        rs.getString("ESPECIALIDADE"),
                        rs.getInt("IDADE"),
                        rs.getString("HOSPITAL"),
                        rs.getInt("NIVEL_HABILIDADE"),
                        Categoria.values()[rs.getInt("CATEGORIA_ID") - 1] // Converte o ID da categoria de volta para enum
                );
            }
        }
        return null;
    }

    // Método para listar todos os cirurgiões
    public List<Cirurgiao> findAll() throws SQLException {
        String sql = "SELECT * FROM CIRURGIAO";
        List<Cirurgiao> cirurgioes = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cirurgiao cirurgiao = new Cirurgiao(
                        rs.getString("NOME_MEDICO"),
                        rs.getInt("EXPERIENCIA"),
                        rs.getString("ESPECIALIDADE"),
                        rs.getInt("IDADE"),
                        rs.getString("HOSPITAL"),
                        rs.getInt("NIVEL_HABILIDADE"),
                        Categoria.values()[rs.getInt("CATEGORIA_ID") - 1]
                );
                cirurgioes.add(cirurgiao);
            }
        }
        return cirurgioes;
    }

    // Método para atualizar os dados de um cirurgião
    public void update(Cirurgiao cirurgiao) throws SQLException {
        String sql = "UPDATE CIRURGIAO SET EXPERIENCIA = ?, ESPECIALIDADE = ?, IDADE = ?, HOSPITAL = ?, NIVEL_HABILIDADE = ?, CATEGORIA_ID = ? WHERE NOME_MEDICO = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, cirurgiao.getExperiencia());
            stmt.setString(2, cirurgiao.getEspecialidade());
            stmt.setInt(3, cirurgiao.getIdade());
            stmt.setString(4, cirurgiao.getHospital());
            stmt.setInt(5, cirurgiao.getNivelHabilidade());
            stmt.setInt(6, cirurgiao.getCategoria().ordinal() + 1); // Converte enum para ID
            stmt.setString(7, cirurgiao.getNome_medico());

            stmt.executeUpdate();
        }
    }

    // Método para deletar um cirurgião pelo nome
    public void delete(String nome_medico) throws SQLException {
        String sql = "DELETE FROM CIRURGIAO WHERE NOME_MEDICO = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome_medico);
            stmt.executeUpdate();
        }
    }
}
