package br.com.laparoscopia.utils;

public class Coordenacao {
    public static int nivelCoordenacao;

    public Coordenacao(int nivel) {
        this.nivelCoordenacao = nivel;
    }

    public int getNivelCoordenacao() {
        return nivelCoordenacao;
    }

    public void setNivelCoordenacao(int nivelCoordenacao) {
        this.nivelCoordenacao = nivelCoordenacao;
    }

    public void testeCoordenacao() {
        System.out.println("\n===== Testando Coordenação =====");
        System.out.println("Nível de Coordenação: " + getNivelCoordenacao());
    }
}