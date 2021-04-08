
package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Gra {

    Gracz player1,player2;
    List<Ruch> ruchy= new ArrayList<>();
   
    void clear(){
        for(int i=0;i<3;i++){
            System.out.println();
        }
    }
    
    public  char winner(Plansza p){
            
                
               if(p.board[0][0]=='X' && p.board[0][1]=='X' && p.board[0][2]=='X')
                   return 'X';
               if(p.board[0][0]=='X' && p.board[1][1]=='X' && p.board[2][2]=='X')
                   return 'X';
               if(p.board[0][0]=='X' && p.board[1][0]=='X' && p.board[2][0]=='X')
                   return 'X';
               if(p.board[0][1]=='X' && p.board[1][1]=='X' && p.board[2][1]=='X')
                   return 'X';
               if(p.board[0][2]=='X' && p.board[1][2]=='X' && p.board[2][2]=='X')
                   return 'X';
               if(p.board[1][0]=='X' && p.board[1][1]=='X' && p.board[1][2]=='X')
                   return 'X';
               if(p.board[2][0]=='X' && p.board[2][1]=='X' && p.board[2][2]=='X')
                   return 'X';
               if(p.board[0][2]=='X' && p.board[1][1]=='X' && p.board[2][0]=='X')
                   return 'X';
               
                if(p.board[0][0]=='O' && p.board[0][1]=='O' && p.board[0][2]=='O')
                   return 'O';
               if(p.board[0][0]=='O' && p.board[1][1]=='O' && p.board[2][2]=='O')
                   return 'O';
               if(p.board[0][0]=='O' && p.board[1][0]=='O' && p.board[2][0]=='O')
                   return 'O';
               if(p.board[0][1]=='O' && p.board[1][1]=='O' && p.board[2][1]=='O')
                   return 'O';
               if(p.board[0][2]=='O' && p.board[1][2]=='O' && p.board[2][2]=='O')
                   return 'O';
               if(p.board[1][0]=='O' && p.board[1][1]=='O' && p.board[1][2]=='O')
                   return 'O';
               if(p.board[2][0]=='O' && p.board[2][1]=='O' && p.board[2][2]=='O')
                   return 'O';
               if(p.board[0][2]=='O' && p.board[1][1]=='O' && p.board[2][0]=='O')
                   return 'O';
               
               else return 'G';
               
        
    }
   
    
    public static void main(String[] args) {
   
        Scanner sc=new Scanner(System.in);
        int x,y;
        int wybor;

        System.out.println("Witaj w konsolowej grze kółko i krzyzyk podaj nazwy zawodników");
               
        
              
        Gra game=new Gra();
        System.out.println("Podaj imie gracza 1");
        String name=sc.nextLine();
       
        System.out.println("Podaj imie gracza 2");
        String name2=sc.nextLine();
        
        Gracz player1=new Gracz(name,'O');
        Gracz player2=new Gracz(name2,'X');

        Plansza p=new Plansza();
        Komentator k=new Komentator();
        
        boolean kolejka=true;
        
        for(int i=0;i<9;i++){
            game.clear();
            p.Drukuj((ArrayList<Ruch>) game.ruchy);
            game.clear();
            System.out.println();
       
        if(kolejka==true && game.winner(p)=='G')
        {
            System.out.println("Zaczyna gracz ze znakiem kółka");
            
            System.out.println("Podaj współrzędną X ");
            x=sc.nextInt();
            
            System.out.println("Podaj współrzędną Y");
            y=sc.nextInt();
            
            Ruch move=new Ruch(1,'O', x, y);
            game.ruchy.add(move);
            System.out.println();
            System.out.println("Gracz "+player1.imie);
          
            kolejka=false;
        }
        else if(game.winner(p)=='G')
        {
            System.out.println("Teraz ruch wykonuje gracz nr 2");
            
            System.out.println("Podaj współrzędną X");
            x=sc.nextInt();
            
            System.out.println("Podaj współrzędną Y");
            y=sc.nextInt();
            
            Ruch move2=new Ruch(2,'X', x, y);
            game.ruchy.add(move2);
            System.out.println("Gracz 2 "+player2.imie);
            game.winner(p);
            kolejka=true;
            
        }
        if(game.winner(p)=='G') k.Drukuj((ArrayList<Ruch>) game.ruchy);
        
        if(game.winner(p)!='G'){
            if(game.winner(p)==player1.znak) System.out.println("Wygrał gracz "+player1.imie);
            if(game.winner(p)==player2.znak) System.out.println("Wygrał gracz "+player2.imie);
            
        }
        
        
        }
        
    }
    
}
