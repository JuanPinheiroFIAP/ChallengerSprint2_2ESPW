    package br.com.laparoscopia.model;

    public class Equipamento {
        public static String nomeEquipamento;
        private String descricao;
        private boolean emUso;

        public Equipamento(String nomeEquipamento, String descricao) {
            this.nomeEquipamento = nomeEquipamento;
            this.descricao = descricao;
            this.emUso = false;
        }

        public String getNome() {
            return nomeEquipamento;
        }

        public void setNome(String nomeEquipamento) {
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

        public void usarEquipamento() {
            this.emUso = true;
            System.out.println("Equipamento " + nomeEquipamento + " está em uso.");
        }

        public void pararUso() {
            this.emUso = false;
            System.out.println("Equipamento " + nomeEquipamento + " não está mais em uso.");
        }

        public void testeEquipamentos() {
            System.out.println("\n===== Testando Equipamento =====");
            System.out.println("Nome do Equipamento: " + getNome());
            System.out.println("Descrição do Equipamento: " + getDescricao());
        }
    }