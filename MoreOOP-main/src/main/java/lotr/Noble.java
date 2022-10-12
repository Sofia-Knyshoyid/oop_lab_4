package lotr;

import java.util.Random;
import kick.NobleKick;
import str.RegularStr;

public class Noble extends Character{
    private int health_param1;
    private int health_param2;
    private String name;


    public Noble(int param1, int param2, String nameval){
        health_param1 = param1;
        health_param2 = param2;
        name = nameval;
        setHp(new Random().nextInt(health_param1) + health_param2);
        setPower(new Random().nextInt(health_param1) + health_param2);
    }

    public void kick(Character c){
        NobleKick nblkick = new NobleKick(c, this);
        nblkick.kick();
    }

    public String toString(){
        RegularStr str = new RegularStr(this, name);
        return  str.toString();

//        String line = name+"{hp=" + getHp()+", power=" +getPower()+ "}";
//        return line;
    }
}
