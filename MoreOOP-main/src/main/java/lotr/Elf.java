package lotr;
import kick.ElfKick;
import str.RegularStr;

public class Elf extends Character {
    public Elf(){
        setHp(10);
        setPower(10);
    }
    public void kick(Character c){
        ElfKick elfkick = new ElfKick(c, this);
        elfkick.kick();
        }
    public String toString(){
        RegularStr str = new RegularStr(this, "Elf");
        return str.toString();
    }
}


// class Elf
//attributes: int power=10, int hp=10
//methods: void kick(Character c) { kill everybody weaker than him, otherwise decrease the power of character by 1 }