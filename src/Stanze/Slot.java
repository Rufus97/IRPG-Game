package Stanze;

import Input.Casuale;
import Input.In;
import Main.GamePanel;

public class Slot {
        static double bet = 0.25;
        static double credito = 0;
        static int[][] linea = new int[4][4];

    public static void giocaSlot(){

        caricaVettoreLoss();
     
        int scelta;
        do{ 
           
            stampaVlt();
            System.out.println("1. spin 2. scarica 3.cambia bet 0 scarica ed esci");
            scelta = In.inputInt();

            switch (scelta) {
                case 1:
                if(GamePanel.giocatore.getSoldi() >= 2){
                    GamePanel.clearScreen();
                    playSlot();
                    break;
                }else{
                    System.out.println("Non hai manco 2 euro vai a giocare nel parco");
                }

                case 2:

                    GamePanel.giocatore.setSoldi(credito);
                    credito = 0;
                    GamePanel.giocatore.getSoldi();
                    break;
                
                case 3:
                    bet = cambiaBet();
                break;
                
                case 0:
                    GamePanel.giocatore.setSoldi(credito);
                    credito = 0;
                    GamePanel.clearScreen();
                    break;

                default:

                    break;
            }
        }while(scelta != 0 );
    }

    public static void playSlot(){
       
        if(credito < bet){
            if(bet <= 1){
                credito = credito +1;
                GamePanel.giocatore.setSoldi(-1d);
            }else{
                credito = credito + bet;
                GamePanel.giocatore.setSoldi((bet *-1));
            }
        }
        credito = credito - bet;
        

        linea = caricaVettoreLoss();

        if(haiVinto()){
            caricaVetoreWin(linea);
        }
    
    //stampaVlt();
    }

    public static void stampaVlt(){
        System.out.println("Soldi " + GamePanel.giocatore.getSoldi() + "\nVLT DEVELBET");
        System.out.println("------------");
        for(int j = 0 ; j < 4; j++){
            System.out.print("|  ");
            for(int i = 0 ; i < 4; i++){
               
                switch (linea[j][i]) {
                    case 0:
                        System.out.print((char)3 + " ");
                        break;
                    
                    case 1:

                        System.out.print((char)4 + " ");
                        break;
                    case 2:

                        System.out.print((char)5 + " ");
                        break;
                    
                    case 3:
                        System.out.print((char)6 + " ");
                        break;

                    default:
                        break;
                }
            }
            System.out.println(" |");
        }
        System.out.println("|Credit" + credito + "  |");
        System.out.println("|BET: " + bet + "  |");
        System.out.println("------------");
        
    }

    public static int[][] caricaVetoreWin(int[][] linea){

        int[][] lineaWin = linea ;
        //la linea vincente
        int lineaVincente = Casuale.numeroCasualeTra(0, 3);
        System.out.println(" linea vincente " + (lineaVincente +1));
        //simbolo vincente
        int simboloVincente = Casuale.numeroCasualeTra(0, 3);

        for(int i = 0 ; i < 4 ; i++){

            lineaWin[lineaVincente][i] = simboloVincente;
        }

        return lineaWin ;
    }

    public static int[][] caricaVettoreLoss(){
       
        int[][] lineaLoss = new int[4][4];

        for(int j = 0 ; j < 4; j++){
            for(int i = 0 ; i < 4; i++){

                lineaLoss[j][i] = Casuale.numeroCasualeTra(0, 3);
            }

            int sommaControllo = lineaLoss[j][0] + lineaLoss[j][1] + lineaLoss[j][2] + lineaLoss[j][3];
                if(sommaControllo == 0 || sommaControllo == 4 || sommaControllo == 8 || sommaControllo == 16 ){
                    if(lineaLoss[j][0] == 0 ){
                        lineaLoss[j][0] ++;
                    }else{
                    lineaLoss[j][0] --;
                }
            }
        }
        return lineaLoss;
    }
   
    public static boolean haiVinto(){

        
        if(Casuale.numeroCasuale()>0.5){
          
            System.out.print("Hai Vinto");
            credito = credito + (bet*2);
            return true;
        }else{
         
            System.out.println("Hai perso");
            return false;
        }
        

    }

    public static double cambiaBet(){
        
        System.out.println("Scegli il bet \n 1. 0.25\n 2. 0.50 \n 3. 1.00 \n 4. 2.00");
        int scelta =1;
        double bet = 0.25;
        do{
            scelta = In.inputInt();

            switch (scelta) {
                case 1:
                    bet = 0.25;
                    break;

                    case 2:
                    bet = 0.50d;
                    break;

                    case 3:
                    bet = 1.00d;
                    break;

                    case 4:
                    bet = 2.00d;
                    break;
            
                default:  
                System.out.println("scelta errata");
                    break;
            }

        }while(scelta > 4 || scelta < 0);
     
        return bet;
    }
}