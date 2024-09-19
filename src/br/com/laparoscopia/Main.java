package br.com.laparoscopia;

import br.com.laparoscopia.dao.CirurgiaoDAO;
import br.com.laparoscopia.model.*;
import br.com.laparoscopia.utils.Menu;
import br.com.laparoscopia.utils.Coordenacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Estabelecendo conexão com o banco de dados (ajuste com seus dados de conexão)
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "username", "password");

            // Instanciando o DAO com a conexão
            CirurgiaoDAO cDao = new CirurgiaoDAO(connection);

            // Criando objetos do modelo
            Cirurgiao cirurgiao = new Cirurgiao("Dr. Silva", 5, "Laparoscopia", 40, "Hospital Central", 7, Categoria.ESTUDANTE);
            Sala sala = new Sala("Sala 1", 3);
            Paciente paciente = new Paciente("João", 30, "Apendicite");
            Equipamento equipamento = new Equipamento("Laparoscópio", "Equipamento usado para procedimentos laparoscópicos.");
            Procedimento procedimento = new Procedimento("Apendicectomia", 45);
            Coordenacao coordenacao = new Coordenacao(2);

            // Criando o cirurgião no banco de dados
            cDao.insert(cirurgiao);

            // Exibindo menu de interação
            Menu menu = new Menu(cirurgiao, sala, paciente, equipamento, procedimento);
            menu.exibirMenu();

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ou executar operações no banco de dados: " + e.getMessage());
        } finally {
            // Fechar a conexão após o uso
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
                }
            }
        }
    }
}
