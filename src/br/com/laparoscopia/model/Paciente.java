package br.com.laparoscopia.model;

public class Paciente {
    private String nome;
    private int idade;
    private String condicao;

    public Paciente(String nome, int idade, String condicao) {
        this.nome = nome;
        this.idade = idade;
        this.condicao = condicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public void exibirDetalhes() {
        System.out.println("Paciente: " + nome + ", Idade: " + idade + ", Condição: " + condicao);
    }

    public void testePaciente () {
        System.out.println("\n===== Testando Paciente =====");
        System.out.println("Nome do Paciente: " + getNome());
        System.out.println("Idade do Paciente: " + getIdade());
        System.out.println("Condição do Paciente: " + getCondicao());
    }
}