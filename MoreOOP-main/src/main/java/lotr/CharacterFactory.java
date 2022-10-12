package lotr;

import org.reflections.Reflections;

import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    public static Character createCharacter() throws InstantiationException, IllegalAccessException {
        Class[] characters = {Hobbit.class, Elf.class, King.class, Knight.class}; //King.class

        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends lotr.Character>> subTypes = reflections.getSubTypesOf(lotr.Character.class);
//        System.out.println(subTypes);
        // since here not all subclasses will be used (not template classes like Noble), use chosen classes from "charachters"

        int idx = new Random().nextInt(4);
        Class character = characters[idx];
        Character NewCh = (Character) character.newInstance();
        return NewCh;

    }
}
