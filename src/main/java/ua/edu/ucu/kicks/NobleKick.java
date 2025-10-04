package ua.edu.ucu.kicks;
import java.util.Random;

import ua.edu.ucu.Character;

public class NobleKick extends Kick {
    @Override
    public void kick(Character kicker, Character kicked) {
        Random random = new Random();

        int kickedHp = kicked.getHp();
        kicked.setHp(kickedHp - random.nextInt(kicker.getPower()));
    }
}