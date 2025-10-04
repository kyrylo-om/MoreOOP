package ua.edu.ucu;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Character[] characters = {new Elf(), new Hobbit()};

        // Let's check which type Elf.class and Hobbit.class has
        Class<Elf> eltype = Elf.class;
        Class<Hobbit> hobClass = Hobbit.class;

        // Class<? extends Character> is super class to Class<Elf>
        Class<? extends Character> newEl = eltype;

        // Now let's create list of superclasses and add all elements to it 
        List<Class<? extends Character>> lst = new ArrayList<>();
        lst.add(Elf.class);
        lst.add(Hobbit.class);

        // Get set of all elements that are subtype of Character.class
        Reflections reflections = new Reflections("ua.edu.ucu");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);

        // Convert set to list and extract random element
        List<Class<? extends Character>> lstSubTypes = new ArrayList<>();
        lstSubTypes.addAll(subTypes);
        Class<? extends Character> cls = lstSubTypes.get(new Random().nextInt(lstSubTypes.size()));

        // Convert class to an object
        Character chr = cls.getDeclaredConstructor().newInstance();
        System.out.println(chr);
    }
}