package br.com.laparoscopia.model;

public class Cirurgiao {
    private String nome_medico; // Nome do Médico
    private int experiencia; // Em anos 
    private String especialidade; // POderia ser variada porém estamos trabalhando com Laparoscopia 
    private int idade; // Idade do Médico 
    private String hospital; // Nome do hospital onde o Médico está realizando a cirurgia
    private int nivelHabilidade; // Atributo do jogo, nivel de habilidade do Player 
    private Categoria categoria; // Categoria do Médico Estudante, Residente e etc. 
    private int nivel; // Atributo do jogo, nivel de coordenação do Médico

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
        this.nivelHabilidade = novoNivelHabilidade;
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
        System.out.println("Experiência: " + getExperiencia() + " anos");
        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Hospital: " + getHospital());
        System.out.println("Nível de Habilidade: " + getNivelHabilidade());
        System.out.println("Categoria: " + getCategoria());
    }
}
