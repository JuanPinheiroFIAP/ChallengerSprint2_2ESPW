package br.com.laparoscopia;

import br.com.laparoscopia.DAO.CirurgiaoDAO;
import br.com.laparoscopia.model.*;
import br.com.laparoscopia.utils.Menu;
import br.com.laparoscopia.utils.Coordenacao;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        CirurgiaoDAO cDao = new CirurgiaoDAO();
        Cirurgiao cirurgiao = new Cirurgiao("Dr. Silva", 5, "Laparoscopia", 40, "Hospital Central", 7, Categoria.ESTUDANTE);
        TreinoCirurgiao  TreinoCirurgiao = new TreinoCirurgiao();
        Sala sala = new Sala("Sala 1", 3);
        Paciente paciente = new Paciente("João", 30, "Apendicite");
        Equipamento equipamento = new Equipamento("Laparoscópio", "Equipamento usado para procedimentos laparoscópicos.");
        Procedimento procedimento = new Procedimento("Apendicectomia", 45);
        Coordenacao coordenacao = new Coordenacao(2);
        cDao.createCirurgiao(cirurgiao);
        //Exibir menu
        Menu menu = new Menu(cirurgiao, sala, paciente, equipamento, procedimento);
        menu.exibirMenu();
    }
}