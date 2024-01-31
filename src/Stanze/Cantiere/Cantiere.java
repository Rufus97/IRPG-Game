package Stanze.Cantiere;

import Input.In;

public class Cantiere {
    
    String nome;
    Boolean giaStato = false;
    
    //costruttore
   public Cantiere(String nome){
    this.nome = nome;
   }

    public void runCantiere(){

        int scelta;

        System.out.println("Cosa vuoi fare?");
        System.out.println("1. Commenta i lavori");
        System.out.println("2. Correggi l operaio");
        System.out.println("3. Entra nel cantiere");  //ruba qualcosa rame ferro attrezzi
        System.out.println("4. Taglia per il cantiere"); //tempo --
        System.out.println("0. Torna indietro e prosegui per la destinazione"); //tempo ++

        scelta = In.inputInt();

        
        switch (scelta) {
            case 1:
                
                break;

                case 2:
                
                break;
        
            default:
                break;
        }



    }

}
