package lotr;

import kick.HobbitKick;
import str.RegularStr;

public class Hobbit extends Character {
    public Hobbit(){
        setHp(3);
        setPower(0);
    }

    public void kick(Character c){
        HobbitKick hobbkick = new HobbitKick();
        hobbkick.kick();
    }

    public String toString(){
        RegularStr str = new RegularStr(this, "Hobbit");
        return str.toString();
    }

}


//class Hobbit
//  - attributes: int power=0, int hp=3
//          - methods: void kick(Character c) { toCry() }