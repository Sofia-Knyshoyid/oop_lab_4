package kick;

import java.util.Random;

import lotr.Character;
import lotr.Noble;

public class NobleKick implements BasicKick {
    Character the_ch;
    Noble the_n;
    public NobleKick(Character character, Noble noble){
        the_ch = character;
        the_n = noble;
    }

    public void kick(Character c, Noble n){
        int damage = 1 + new Random().nextInt(n.getPower()-1);
        c.setHp(c.getHp()-damage);
    }

    public void kick() {
        kick(the_ch, the_n);
    }
}
