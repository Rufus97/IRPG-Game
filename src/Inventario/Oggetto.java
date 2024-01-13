package Inventario;
// Suppongo sia necessaria anche una superclasse "Oggetto"

    public class Oggetto {
        private String nome;
        private int quantita;

        public Oggetto(String nome, int quantita) {
            this.nome = nome;
            this.quantita = quantita;
        }

        public String getNome() {
            return nome;
        }

        public int getQuantita() {
            return quantita;
        }


    }

