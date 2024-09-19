package br.com.laparoscopia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnect {
    // Estabelecendo uma conexão com o banco de dados 
    public String url ="jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    // Usuario do banco
    public String user = "rm552202";
    // senha do banco
    public String password = "300605";

    //criando uma função para conectar no banco de dados
    public Connection conect(){
        //Conecções sql sempre vao precisar de try and catch caso haja erro, oque é bem comum
        try {
            //retornando uma conecção direta com o bando de dados ja utilizando as entradas corretas
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
