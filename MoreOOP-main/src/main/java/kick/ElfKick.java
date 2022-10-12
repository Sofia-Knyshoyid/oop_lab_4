package kick;

import lotr.Character;
import lotr.Elf;
import lotr.Noble;

public class ElfKick implements BasicKick{
    Character the_ch;
    Elf the_elf;

    public ElfKick(Character character, Elf elf){
        the_elf = elf;
        the_ch = character;
    }

    public void kick(Character c, Elf e){
        if (c.getPower()<e.getPower()){
            c.setHp(0);
        }
        else{
            c.setPower(c.getPower()-1);
        }
    }

    public void kick() {
        kick(the_ch, the_elf);
    }

}


