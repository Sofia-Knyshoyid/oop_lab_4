import lotr.Character;
import game.GameManager;
import lotr.CharacterFactory;
import org.junit.jupiter.api.Test;


public class FightTest {
    @Test
    void FightTest() throws InstantiationException, IllegalAccessException {
        Character char1 = CharacterFactory.createCharacter();
        Character char2 = CharacterFactory.createCharacter();
        GameManager game = new GameManager();
        game.fight(char1, char2);
    }
}
