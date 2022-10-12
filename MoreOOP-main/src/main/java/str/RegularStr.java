package str;
import lotr.Character;

public class RegularStr {
    Character character;
    String the_name;
    public RegularStr(Character c, String name){
        character = c;
        the_name = name;
    }

    public String toString(){
        return the_name+"{hp=" + character.getHp()+", power=" + character.getPower()+ "}";
    }
}
