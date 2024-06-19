package br.com.laparoscopia.model;

public class Procedimento {
    private String tipo;
    private int duracao; // em minutos

    public Procedimento(String tipo, int duracao) {
        this.tipo = tipo;
        this.duracao = duracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void iniciarProcedimento() {
        System.out.println("Iniciando procedimento: " + tipo + " com duração de " + duracao + " minutos.");
    }

    public void testeProcedimento() {
        System.out.println("\n===== Testando Procedimento =====");
        System.out.println("Tipo de Procedimento: " + getTipo());
        System.out.println("Duração do Procedimento: " + getDuracao() + " minutos");
    }
}
