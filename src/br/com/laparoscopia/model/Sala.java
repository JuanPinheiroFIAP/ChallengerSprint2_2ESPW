package br.com.laparoscopia.model;
import br.com.laparoscopia.model.Cirurgiao;

public class Sala {
    public String nome_sala;
    public int nivelDificuldade;

    public Sala(String nome_sala, int nivelDificuldade) {
        this.nome_sala = nome_sala;
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getNome() {
        return nome_sala;
    }

    public void setNome(String nome) {
        this.nome_sala = nome;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public void iniciarSimulacao() {
        System.out.println("O: " + Cirurgiao.nome_medico + " está iniciando simulação na sala " + nome_sala + " com dificuldade " + nivelDificuldade);
    }

    public void testeSala() {
        System.out.println("\n===== Testando Sala =====");
        System.out.println("Nome da Sala: " + getNome());
        System.out.println("Nível de Dificuldade: " + getNivelDificuldade());
    }
}