package ua.edu.ucu;

import java.util.Random;

public class King extends Character {
    public King() {
        super(new Random().nextInt(15 - 5) + 5, new Random().nextInt(15 - 5) + 5);
    }

    @Override
    public void kick(Character c) {

    }
}
