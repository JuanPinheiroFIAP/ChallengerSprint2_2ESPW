package br.com.laparoscopia.utils;

import br.com.laparoscopia.model.*;
import br.com.laparoscopia.core.Jogo;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Cirurgiao cirurgiao;
    private Sala sala;
    private Paciente paciente;
    private Equipamento equipamento;
    private Procedimento procedimento;
    private TreinoCirurgiao treinoCirurgiao;

    public Menu(Cirurgiao cirurgiao, Sala sala, Paciente paciente, Equipamento equipamento, Procedimento procedimento) {
        this.scanner = new Scanner(System.in);
        this.cirurgiao = cirurgiao;
        this.sala = sala;
        this.paciente = paciente;
        this.equipamento = equipamento;
        this.procedimento = procedimento;
        this.treinoCirurgiao = new TreinoCirurgiao();
    }

    public void exibirMenu() {
        Jogo jogo = new Jogo(cirurgiao, sala, paciente, equipamento, procedimento);
        jogo.iniciarJogo();
        int opcao;
        do {
            System.out.println("\n===== Menu Principal =====");
            System.out.println("1. Testar Classes");
            System.out.println("2. Modificar Atributos");
            System.out.println("3. Realizar Treino");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    testarClasses();
                    break;
                case 2:
                    modificarAtributos();
                    break;
                case 3:
                    realizarTreino();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 4);
    }

    private void testarClasses() {
        cirurgiao.teste();
        sala.testeSala();
        paciente.testePaciente();
        equipamento.testeEquipamentos();
        procedimento.testeProcedimento();
    }

    private void modificarAtributos() {
        int opcao;
        do {
            System.out.println("\n===== Modificar Atributos =====");
            System.out.println("1. Cirurgião");
            System.out.println("2. Sala");
            System.out.println("3. Paciente");
            System.out.println("4. Equipamento");
            System.out.println("5. Procedimento");
            System.out.println("6. Voltar ao Menu Principal");
            System.out.print("Escolha uma classe: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    modificarCirurgiao();
                    break;
                case 2:
                    modificarSala();
                    break;
                case 3:
                    modificarPaciente();
                    break;
                case 4:
                    modificarEquipamento();
                    break;
                case 5:
                    modificarProcedimento();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 6);
    }

    private void modificarCirurgiao() {
        int opcao;
        do {
            System.out.println("\n===== Modificar Cirurgião =====");
            System.out.println("1. Nome");
            System.out.println("2. Experiência");
            System.out.println("3. Especialidade");
            System.out.println("4. Idade");
            System.out.println("5. Hospital");
            System.out.println("6. Nível de Habilidade");
            System.out.println("7. Voltar ao Menu Principal");
            System.out.print("Escolha um atributo para modificar: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Novo nome: ");
                    String nome = scanner.nextLine();
                    cirurgiao.setNome(nome);
                    break;
                case 2:
                    System.out.print("Nova experiência (anos): ");
                    int experiencia = scanner.nextInt();
                    scanner.nextLine();
                    cirurgiao.setExperiencia(experiencia);
                    break;
                case 3:
                    System.out.print("Nova especialidade: ");
                    String especialidade = scanner.nextLine();
                    cirurgiao.setEspecialidade(especialidade);
                    break;
                case 4:
                    System.out.print("Nova idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    cirurgiao.setIdade(idade);
                    break;
                case 5:
                    System.out.print("Novo hospital: ");
                    String hospital = scanner.nextLine();
                    cirurgiao.setHospital(hospital);
                    break;
                case 6:
                    System.out.print("Novo nível de habilidade: ");
                    int nivelHabilidade = scanner.nextInt();
                    scanner.nextLine();
                    cirurgiao.setNivelHabilidade(nivelHabilidade);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 7);
    }

    private void modificarSala() {
        int opcao;
        do {
            System.out.println("\n===== Modificar Sala =====");
            System.out.println("1. Nome da Sala");
            System.out.println("2. Nível de Dificuldade");
            System.out.println("3. Voltar ao Menu Principal");
            System.out.print("Escolha um atributo para modificar: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Novo nome da sala: ");
                    String nomeSala = scanner.nextLine();
                    sala.setNome(nomeSala);
                    break;
                case 2:
                    System.out.print("Novo nível de dificuldade: ");
                    int nivelDificuldade = scanner.nextInt();
                    scanner.nextLine();
                    sala.setNivelDificuldade(nivelDificuldade);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 3);
    }

    private void modificarPaciente() {
        int opcao;
        do {
            System.out.println("\n===== Modificar Paciente =====");
            System.out.println("1. Nome");
            System.out.println("2. Idade");
            System.out.println("3. Condição");
            System.out.println("4. Voltar ao Menu Principal");
            System.out.print("Escolha um atributo para modificar: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Novo nome do paciente: ");
                    String nome = scanner.nextLine();
                    paciente.setNome(nome);
                    break;
                case 2:
                    System.out.print("Nova idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    paciente.setIdade(idade);
                    break;
                case 3:
                    System.out.print("Nova condição: ");
                    String condicao = scanner.nextLine();
                    paciente.setCondicao(condicao);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 4);
    }

    private void modificarEquipamento() {
        int opcao;
        do {
            System.out.println("\n===== Modificar Equipamento =====");
            System.out.println("1. Nome");
            System.out.println("2. Descrição");
            System.out.println("3. Voltar ao Menu Principal");
            System.out.print("Escolha um atributo para modificar: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Novo nome do equipamento: ");
                    String nome = scanner.nextLine();
                    equipamento.setNome(nome);
                    break;
                case 2:
                    System.out.print("Nova descrição: ");
                    String descricao = scanner.nextLine();
                    equipamento.setDescricao(descricao);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 3);
    }

    private void modificarProcedimento() {
        int opcao;
        do {
            System.out.println("\n===== Modificar Procedimento =====");
            System.out.println("1. Tipo");
            System.out.println("2. Duração");
            System.out.println("3. Voltar ao Menu Principal");
            System.out.print("Escolha um atributo para modificar: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Novo tipo de procedimento: ");
                    String tipo = scanner.nextLine();
                    procedimento.setTipo(tipo);
                    break;
                case 2:
                    System.out.print("Nova duração (minutos): ");
                    int duracao = scanner.nextInt();
                    scanner.nextLine();
                    procedimento.setDuracao(duracao);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 3);
    }

    private void realizarTreino() {
        int opcao;
        int quantidadeTreino;
        do {
            System.out.println("\n===== Realizar Treino =====");
            System.out.println("1. Iniciar Treino");
            System.out.println("2. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade de repetições para o treino: ");
                    quantidadeTreino = scanner.nextInt();
                    scanner.nextLine();

                    treinoCirurgiao.realizarTreino(quantidadeTreino);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 2);
    }
}