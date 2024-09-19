package br.com.laparoscopia.model;

public class Equipamento {
    private String nomeEquipamento;  // Removido o static para que cada objeto tenha seu próprio nome
    private String descricao;
    private boolean emUso;

    // Construtor
    public Equipamento(String nomeEquipamento, String descricao) {
        this.nomeEquipamento = nomeEquipamento;
        this.descricao = descricao;
        this.emUso = false;
    }

    // Getters e Setters
    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
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

    // Métodos para usar e parar o uso do equipamento
    public void usarEquipamento() {
        this.emUso = true;
        System.out.println("Equipamento " + nomeEquipamento + " está em uso.");
    }

    public void pararUso() {
        this.emUso = false;
        System.out.println("Equipamento " + nomeEquipamento + " não está mais em uso.");
    }

    // Método de teste
    public void testeEquipamentos() {
        System.out.println("\n===== Testando Equipamento =====");
        System.out.println("Nome do Equipamento: " + getNomeEquipamento());
        System.out.println("Descrição do Equipamento: " + getDescricao());
        System.out.println("Em Uso: " + (isEmUso() ? "Sim" : "Não"));
    }
}
