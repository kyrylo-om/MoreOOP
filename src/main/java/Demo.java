import java.lang.reflect.InvocationTargetException;

import ua.edu.ucu.Character;
import ua.edu.ucu.CharacterFactory;

public class Demo {
    public static void main(String args[]) 
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("Hello, world!");

        Character randomCharacter = CharacterFactory.createRandomCharacterWithReflextion();

        System.out.println(randomCharacter);

        for (int i = 0; i < 10; i++) {
            System.out.println(CharacterFactory.createRandomCharacterWithReflextion());
        }

    }
}
