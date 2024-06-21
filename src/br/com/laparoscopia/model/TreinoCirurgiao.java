package br.com.laparoscopia.model;
import br.com.laparoscopia.utils.Coordenacao;

public class TreinoCirurgiao {
    private String nomeCirurgiao;
    private String equipamento;
    private String procedimento;
    private Cirurgiao cirurgiao;
    private Coordenacao coordenacao;

    public TreinoCirurgiao() {
        this.nomeCirurgiao = Cirurgiao.nome_medico;
        this.equipamento = Equipamento.nomeEquipamento;
        this.procedimento = Procedimento.tipoProcedimento;
    }

    public void realizarTreino(int quantidade) {
        System.out.println("Iniciando treino para o cirurgião " + nomeCirurgiao + "...");
        System.out.println("Equipamento utilizado: " + equipamento);
        System.out.println("Procedimento de treino: " + procedimento);

        if (quantidade > 0) {
            int novoNivelHabilidade = quantidade + Cirurgiao.nivelHabilidade;
            int novoNivelCoordenacao = quantidade + Coordenacao.nivelCoordenacao;
            System.out.println(nomeCirurgiao + " treinou e melhorou seu nível de habilidade para: " + novoNivelHabilidade + "\nE o seu nível de coordenação para: " + novoNivelCoordenacao);
            Cirurgiao.nivelHabilidade = novoNivelHabilidade;
            Coordenacao.nivelCoordenacao = novoNivelHabilidade;
        } else {
            System.out.println("O valor da quantidade deve ser maior que zero para realizar o treinamento.");
        }
    }

    public void realizarTreinoCoordenacao(int quantidade) {
        System.out.println("Iniciando treino para o cirurgião " + nomeCirurgiao + "...");
        System.out.println("Equipamento utilizado: " + equipamento);
        System.out.println("Procedimento de treino: " + procedimento);

        if (quantidade > 0) {
            int novoNivelHabilidade = quantidade + Cirurgiao.nivelHabilidade;
            System.out.println(nomeCirurgiao + " treinou e melhorou seu nível de habilidade para: " + novoNivelHabilidade);
            Cirurgiao.nivelHabilidade = novoNivelHabilidade;
        } else {
            System.out.println("O valor da quantidade deve ser maior que zero para realizar o treinamento.");
        }
    }
}