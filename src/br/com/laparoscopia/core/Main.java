package br.com.laparoscopia.core;

import br.com.laparoscopia.model.*;
import br.com.laparoscopia.utils.Coordenacao;

public class Main {
    public static void main(String[] args) {
        // Instanciando objetos das classes
        Cirurgiao cirurgiao = new Cirurgiao("Dr. Silva", 5, "Laparoscopia", 40, "Hospital Central", 7, Categoria.ESTUDANTE);

        Sala sala = new Sala("Sala 1", 3);

        Paciente paciente = new Paciente("João", 30, "Apendicite");

        Equipamento equipamento = new Equipamento("Laparoscópio", "Equipamento usado para procedimentos laparoscópicos.");

        Procedimento procedimento = new Procedimento("Apendicectomia", 45);

        Coordenacao coordenacao = new Coordenacao(2);

        // Testando Cirurgiao
        cirurgiao.teste();
        cirurgiao.realizarProcedimento();
        cirurgiao.treinar(4);

        // Testando Sala
        sala.testeSala();
        sala.iniciarSimulacao();

        // Testando Paciente
        paciente.testePaciente();
        paciente.exibirDetalhes();

        // Testando Equipamento
        equipamento.testeEquipamentos();
        equipamento.usarEquipamento();
        equipamento.pararUso();

        // Testando Procedimento
        procedimento.testeProcedimento();
        procedimento.iniciarProcedimento();

        // Testando Coordenacao
        coordenacao.testeCoordenacao();
        coordenacao.melhorarCoordenacao();

        // Integrando tudo em um jogo
        System.out.println("\n===== Iniciando Jogo =====");
        Jogo jogo = new Jogo(cirurgiao, sala, paciente, equipamento, procedimento);
        jogo.iniciarJogo();
    }
}

