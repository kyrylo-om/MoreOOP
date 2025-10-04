package ua.edu.ucu;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;
import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    private static final Random RANDOM = new Random();

    private static final List<Class<?>> classes = List.of(Hobbit.class, Elf.class, King.class, Knight.class);

    public static Character createRandomCharacter() {
        int choice = RANDOM.nextInt(4);
        
        switch (choice) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new Knight();
            case 3:
                return new King();
        }
        return null;
    }

    public static Character createRandomCharacterWithReflextion() 
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        
        int choice = RANDOM.nextInt(classes.size());
        Class<?> characterClass = classes.get(choice);
        return (Character) characterClass.getDeclaredConstructor().newInstance();
    }

    public static Character createRandomCharacterWithLibReflections() 
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Reflections reflections = new Reflections("ua.edu.ucu");
        
        Set<Class<?>> subTypes = reflections.get(SubTypes.of(Character.class).asClass());

        int choice = RANDOM.nextInt(subTypes.size());
        Class<?> characterClass = (Class<?>) subTypes.toArray()[choice];

        return (Character) characterClass.getDeclaredConstructor().newInstance();
    }
}