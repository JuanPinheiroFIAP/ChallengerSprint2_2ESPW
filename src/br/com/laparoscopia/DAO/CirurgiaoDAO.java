package br.com.laparoscopia.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.laparoscopia.model.Cirurgiao;

public class CirurgiaoDAO {
    private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static final String PASSWORD = "300605";
    private static final String USER = "rm552202";

    public CirurgiaoDAO(){

    }
    public void createCirurgiao(Cirurgiao cirurgiao) throws SQLException {
        Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
        String sql = "INSERT INTO Cirurgiao (nome_medico, experiencia, especialidade, idade, hospital, nivelHabilidade, categoria) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cirurgiao.getNome_medico());
            stmt.setInt(2, cirurgiao.getExperiencia());
            stmt.setString(3, cirurgiao.getEspecialidade());
            stmt.setInt(4, cirurgiao.getIdade());
            stmt.setString(5, cirurgiao.getHospital());
            stmt.setInt(6, cirurgiao.getNivelHabilidade());
            stmt.setString(7, cirurgiao.getCategoria().toString()); // Assumindo que Categoria tem um método toString()
            stmt.executeUpdate();
            connection.close();
        }catch (SQLException e){
            e.getErrorCode();
        }
    }
}
