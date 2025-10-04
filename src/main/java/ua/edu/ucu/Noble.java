package ua.edu.ucu;

import java.util.Random;

public class Noble extends Character {
    public Noble(int min_hp, int max_hp, int min_power, int max_power) {
        super(new Random().nextInt(max_hp-min_hp) + min_hp, new Random().nextInt(max_power-min_power) + min_power);
    }
    @Override
    public void kick(Character c) {
        
    }
}
