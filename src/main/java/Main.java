import ua.edu.ucu.Character;
import ua.edu.ucu.CharacterFactory;
import ua.edu.ucu.GameManager;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();

        Character c2 = CharacterFactory.createRandomCharacter();
        Character c1 = CharacterFactory.createRandomCharacter();

        gameManager.fight(c1, c2);
    }
}