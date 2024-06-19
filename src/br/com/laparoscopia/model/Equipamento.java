package br.com.laparoscopia.model;

public class Equipamento {
    private String nome;
    private String descricao;
    private boolean emUso;

    public Equipamento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.emUso = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEmUso() {
        return emUso;
    }

    public void setEmUso(boolean emUso) {
        this.emUso = emUso;
    }

    public void usarEquipamento() {
        this.emUso = true;
        System.out.println("Equipamento " + nome + " está em uso.");
    }

    public void pararUso() {
        this.emUso = false;
        System.out.println("Equipamento " + nome + " não está mais em uso.");
    }

    public void testeEquipamentos() {
        System.out.println("\n===== Testando Equipamento =====");
        System.out.println("Nome do Equipamento: " + getNome());
        System.out.println("Descrição do Equipamento: " + getDescricao());
    }
}