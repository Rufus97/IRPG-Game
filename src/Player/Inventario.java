package Player;

import java.util.ArrayList;
public class Inventario {
    private ArrayList<Oggetto> inventario;
    // Crea l'istanza Struttura.Inventario come ArrayList e la chiama inventario
    public Inventario() {
        inventario = new ArrayList<>();
    }

    public void aggiungiItem(Oggetto item) { inventario.add(item);}
    public void rimuoviItem(Oggetto item) { inventario.remove(item);}
    public int quantitaItem(Oggetto item) {
        int quantita = 0;
        for (Oggetto oggettoDaContare : inventario) {
            if (oggettoDaContare.equals(item)) {
                quantita += oggettoDaContare.getQuantita();
            }
        }
        return quantita;
    }
}
/* Guida su come avviare l'istanza, creando un oggetto, per poi aggiungerlo all'inventario:

                    //Switch per definire l'oggetto
                    Oggetto sigarette = new Oggetto("Sigarette", 20);

                    // Aggiunta di sigarette all'inventario
                    inventario.aggiungiItem(sigarette);

                    // Verifica della quantità di sigarette nell'inventario
                    int quantitaSigarette = inventario.quantitaItem(sigarette);
                    System.out.println("Quantità di sigarette nell'inventario: " + quantitaSigarette);
 */

