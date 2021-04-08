
package src;

import java.util.ArrayList;


public class Plansza implements Drukowalny{
    public char[][] board=new char[3][3];
    public void Drukuj(ArrayList<Ruch> ruchy){
          
         
            
          for(Ruch move: ruchy)
          {
            if(board[move.x][move.y]=='\u0000')
                board[move.x][move.y]=move.znak;
            
          }
        for(int i=0;i<3;i++){
            
            for(int j=0;j<3;j++){
                if(board[i][j]=='\u0000'){
                    System.out.print(" | ");
                    if((i==0 || i==1)&& j==2){
                        System.out.println();
                        System.out.println(" -  -  - ");
                    }
                }
                
                else {
                    System.out.print(board[i][j]+" | ");
                    if((i==0|| i==1)&&j==2){
                        System.out.println();
                        System.out.println(" -  -  - ");
                    }
                }
              
                
           
            }
        }
    }
    
}
