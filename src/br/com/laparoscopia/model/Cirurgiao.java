package br.com.laparoscopia.model;

public class Cirurgiao {
    public static String nome_medico;
    private int experiencia;
    private String especialidade;
    private int idade;
    private String hospital;
    public static  int nivelHabilidade;
    private Categoria categoria;
    private int nivel;

    public Cirurgiao(String nome, int experiencia, String especialidade, int idade, String hospital, int nivelHabilidade, Categoria categoria) {
        this.nome_medico = nome;
        this.experiencia = experiencia;
        this.especialidade = especialidade;
        this.idade = idade;
        this.hospital = hospital;
        this.nivelHabilidade = nivelHabilidade;
        this.categoria = categoria;
    }

    public String getNome_medico() {
        return nome_medico;
    }
    public void setNome(String nome) {
        this.nome_medico = nome;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getNivelHabilidade() {
        return nivelHabilidade;
    }

    public void setNivelHabilidade(int novoNivelHabilidade) {
        this.nivel = nivelHabilidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void realizarProcedimento() {
        System.out.println("O cirurgião " + nome_medico + " está realizando um procedimento de laparoscopia.");
    }

    public void teste() {
        System.out.println("===== Testando Cirurgião =====");
        System.out.println("Nome do Cirurgião: " + getNome_medico());
        System.out.println("Experiência: " + getExperiencia() + " anos");;
        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Hospital: " + getHospital());
        System.out.println("Nível de Habilidade: " + getNivelHabilidade());
        System.out.println("Categoria: " + getCategoria());
    }
}