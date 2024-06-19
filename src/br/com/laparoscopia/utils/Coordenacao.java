package br.com.laparoscopia.utils;

public class Coordenacao {
    private int nivel;

    public Coordenacao(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void melhorarCoordenacao() {
        this.nivel++;
        System.out.println("Nível de coordenação melhorado para: " + nivel);
    }

    public void testeCoordenacao() {
        System.out.println("\n===== Testando Coordenação =====");
        System.out.println("Nível de Coordenação: " + getNivel());
    }
}