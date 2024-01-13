package Inventario;
import java.util.ArrayList;

public class Inventario {

    /* L'arrayList crea un ArrayList di ->> <Oggetto> "Appunto definito nella classe Oggetto"
    Dopodiché lo rinomino inventario.
    Quindi la variabile nominata "inventario" contiene un numero indefinito di oggetti Oggetto*/

    private ArrayList<Oggetto> inventario;

    public Inventario() {
        inventario = new ArrayList<>();
    }

    // Aggiungi un consumabile all'inventario
    public void aggiungiItem(Oggetto item) {
        inventario.add(item);
    }

    // Rimuovi un consumabile dall'inventario
    public void rimuoviItem(Oggetto item) {
        inventario.remove(item);
    }

    // Ottieni la quantità di un determinato consumabile nell'inventario
    public int quantitaItem(Oggetto item) {
        int count = 0;
        for (Oggetto c : inventario) {
            if (c.equals(item)) {
                count++;
            }
        }
        return count;
    }


}

