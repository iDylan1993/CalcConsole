/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg.us.pkg5;
import java.util.*;

/**
 *
 * @author Dylan Bastiaanse
 */
public class PRGUS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        LaagsteNummer(); 
        WoordenOmdraaien();
        RechthoekBerekenen();
    }
    
    public static void WoordenOmdraaien() {
      //OPDRACHT 2
      Scanner input = new Scanner(System.in);
      System.out.println("Geef ons een woord, dan krijg u die achterste voren terug.");
      System.out.print("Voer hier u woord in => ");
      String inputtie = input.nextLine();
      //Hier wordt de methode van de String opgeroepen, het process wordt hier aangevraagd en verwerkt.
      String inputtio = Omdraaien(inputtie);
      System.out.print("Het omgedraaide woord is:");
     //Hier wordt de methode van de String opgeroepen en verwerkt in de console.
      System.out.printf(inputtio);
      System.out.print("\n");
   }

    public static String Omdraaien(String inputtie){
       //OPDRACHT 3
       String reverse = "";
       //Hier wordt de lengte van het woord verwerkt.
       for(int i = inputtie.length() - 1; i >= 0; i--)
       {
          //Hier wordt het woordje omgedraaid en in de lokale string gezet naast de methode.
           reverse = reverse + inputtie.charAt(i);
       }
       //Hier wordt de methode als klaargemaakt om door te gaan.
       return reverse;
   }
    
    public static void LaagsteNummer()
    {
        //OPDRACHT 1
       int een;
       int twee;
       int drie;
       Scanner input = new Scanner(System.in);
       System.out.println("Geef ons 3 nummers en we sturen de laagste nummer terug.");
       System.out.print("Voer hier u getal in => ");
       //Hier wordt de lokale int het ingevulde getal opgeslagen. Int1 is dat.
       een = input.nextInt();
       System.out.print("Voer hier u getal in => ");
       //Hier wordt de lokale int het ingevulde getal opgeslagen. Int2 is dat.
       twee = input.nextInt();
       System.out.print("Voer hier u getal in => ");
       //Hier wordt de lokale int het ingevulde getal opgeslagen. Int3 is dat.
       drie = input.nextInt();
      //Hier wordt de methode van de INT opgeroepen, het process wordt hier aangevraagd en verwerkt.
       int nummers = LaagsteNummerThread(een, twee, drie);
       System.out.printf("Het laagste nummer is: %d ", nummers);    
    }
     public static int LaagsteNummerThread(int een, int twee, int drie)
    {
    // OPDRACHT 1
       if ( (een < twee) & (een < drie)) {
           return een;
       }
       else if ( (twee < een) & (twee < drie) ) {
           return twee;
       }
       else if ( (drie < een) & (drie < twee) ) {
           return drie;
       }
       return 0;
   }    
     public static void RechthoekBerekenen()
     {
         //OPDRACHT 3
         int lengte, breedte;
         Scanner SC = new Scanner(System.in);
         System.out.print("Voer de lengte in: ");
         lengte = SC.nextInt();
         System.out.print("Voer de breedte in: ");
         breedte = SC.nextInt();
         //Hier wordt de module aangesproken om de berekening uit te voeren.
         int omtrek = RechthoekOmtrek(lengte,breedte);
         System.out.println("De rechthoek omtrek is: " + omtrek);
     }
      public static int RechthoekOmtrek(int Lengte, int Breedte)
     {
         //OPDRACHT 3
         //Hier wordt de Lengte vermenigvuldigd met de breedte X 2
         return Lengte * Breedte;
     }
}
