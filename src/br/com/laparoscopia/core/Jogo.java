package br.com.laparoscopia.core;

import br.com.laparoscopia.model.Cirurgiao;
import br.com.laparoscopia.model.Equipamento;
import br.com.laparoscopia.model.Paciente;
import br.com.laparoscopia.model.Procedimento;
import br.com.laparoscopia.model.Sala;

public class Jogo {
    private Cirurgiao cirurgiao;
    private Sala sala;
    private Paciente paciente;
    private Equipamento equipamento;
    private Procedimento procedimento;

    public Jogo(Cirurgiao cirurgiao, Sala sala, Paciente paciente, Equipamento equipamento, Procedimento procedimento) {
        this.cirurgiao = cirurgiao;
        this.sala = sala;
        this.paciente = paciente;
        this.equipamento = equipamento;
        this.procedimento = procedimento;
    }

    public void iniciarJogo() {
        System.out.println("\n===== Iniciando Jogo =====");
        sala.iniciarSimulacao();
        paciente.exibirDetalhes();
        equipamento.usarEquipamento();
        procedimento.iniciarProcedimento();
    }
}