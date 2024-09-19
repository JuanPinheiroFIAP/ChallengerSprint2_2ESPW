package br.com.laparoscopia.model;

public class Procedimento {
    private String tipoProcedimento;
    private int duracao;

    public Procedimento(String tipoProcedimento, int duracao) {
        this.tipoProcedimento = tipoProcedimento;
        this.duracao = duracao;
    }

    public String getTipo() {
        return tipoProcedimento;
    }

    public void setTipo(String tipoProcedimento) {
        this.tipoProcedimento = tipoProcedimento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void iniciarProcedimento() {
        System.out.println("Iniciando procedimento: " + tipoProcedimento + " com duração de " + duracao + " minutos.");
    }

    public void testeProcedimento() {
        System.out.println("\n===== Testando Procedimento =====");
        System.out.println("Tipo de Procedimento: " + getTipo());
        System.out.println("Duração do Procedimento: " + getDuracao() + " minutos");
    }
}
