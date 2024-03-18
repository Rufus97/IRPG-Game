package Stanze.Parco;

import Input.In;
import Main.GamePanel;
import Stanze.Stanza;

public class Parchetto implements Stanza {
    private InterazioneSpacciatore interazioneSpacciatore = new InterazioneSpacciatore();

    public Parchetto() {
    }

    @Override
    public void runStanza() {
        System.out.println("Benvenuto al parchetto di Tor bella Monaca");
        boolean continua = true; // Inizializza la variabile continua a true

        while (continua) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Approccia Aziz");
            System.out.println("2. Rolla una canna");
            System.out.println("3. Consulta inventario");
            System.out.println("4. Vai via dal parco");
            System.out.println("5. Visualizza punteggi e soldi");

            int sceltaAzione = In.inputInt();
            switch (sceltaAzione) {
                case 1:
                    interazioneSpacciatore.approcciaLoSpacciatore();
                    break;
                case 2:
                    InterazioneCanna.rollaUnaCanna(true);
                    break;
                case 3:
                    consultaInventario();
                    break;
                case 4:
                    System.out.println("Hai scelto di uscire dal parco.");
                    continua = false;
                    break;
                case 5:
                    visualizzaPunteggiESoldi();
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
    }

    public void vieneArrestato() {
        GamePanel.giocatore.setHP(GamePanel.giocatore.getHP() - 10);
        GamePanel.giocatore.setLivelloSoddisfazione(GamePanel.giocatore.getLivelloSoddisfazione() - 15.0);
        GamePanel.inventario.svuotaInventario();
        System.out.println("Sei stato arrestato! Hai perso punti HP, soddisfazione e i tuoi oggetti sono stati confiscati.");
    }

    private void consultaInventario() {
        System.out.println("Il tuo inventario contiene:");
        System.out.println(GamePanel.inventario.toString());
    }

    private void visualizzaPunteggiESoldi() {
        System.out.println("Punteggi attuali:");
        System.out.println("HP: " + GamePanel.giocatore.getHP());
        System.out.println("Soddisfazione: " + GamePanel.giocatore.getLivelloSoddisfazione());
        System.out.println("Soldi: " + GamePanel.giocatore.getSoldi());
    }

    @Override
    public String getNomeStanza() {
        return "Parchetto";
    }
}




