
package src;

import java.util.ArrayList;

public class Komentator implements Drukowalny {

    @Override
    public void Drukuj(ArrayList<Ruch> ruchy) {
      
        System.out.println("Gracz "+ruchy.get(ruchy.size()-1).numer_gracza+" postawił znak "+ruchy.get(ruchy.size()-1).znak+ " na polu "+ ruchy.get(ruchy.size()-1).x+","+ruchy.get(ruchy.size()-1).y);
    }
   
    }