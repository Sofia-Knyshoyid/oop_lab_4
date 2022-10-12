package game;
import lotr.Character;

public class GameManager {
    public void fight(Character a, Character b){
        while (a.isAlive() && b.isAlive()){
            System.out.println("Characters are fighting...");
            System.out.println(a+" kicks "+b);
            a.kick(b);
            System.out.println("The second player's state after attack: "+b);

            System.out.println(b+" kicks "+a);
            b.kick(a);
            System.out.println("The first player's state after attack: "+a+"\n");
        }
        if (a.isAlive() == false){
            System.out.println("Character "+b+" has won the fight!");
        }
        else{
            System.out.println("Character "+a+" has won the fight!");
        }
    }
}
