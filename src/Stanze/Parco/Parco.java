package Stanze;

import Input.In;
import Player.Personaggio;

public class Parco {

    private Personaggio personaggio;

    public Parco(Personaggio personaggio) {
        this.personaggio = personaggio;
    }

    public void runParco() {
        System.out.println("Benvenuto al parchetto di Tor bella Monaca");
        boolean continua = true;

        while (continua) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Approccia Aziz");
            System.out.println("2. Rolla una canna");
            System.out.println("3. Vai via dal parco");

            int sceltaAzione = In.inputInt();

            switch (sceltaAzione) {
                case 1:
                    interazioneSpacciatore();
                    break;
                case 2:
                    interazioneCanna();
                    break;
                case 3:
                    System.out.println("Hai scelto di uscire dal parco.");
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

        private void interazioneCanna () {
        }

        private void interazioneSpacciatore () {
        }
    }
}
