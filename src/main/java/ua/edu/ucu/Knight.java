package ua.edu.ucu;

import java.util.Random;

public class Knight extends Character {
    public Knight() {
        super(new Random().nextInt(12 - 2) + 2, new Random().nextInt(12 - 2) + 2);
    }

    @Override
    public void kick(Character c) {
        
    }
}
