package ua.edu.ucu.kicks;

import ua.edu.ucu.Character;

public class KillKick extends Kick {
    @Override
    public void kick(Character kicker, Character kicked) {
        if (kicker.getPower() > kicked.getPower()){
            kicked.setHp(0);
        }
        else {
            kicker.setPower(kicker.getPower() - 1);
        }
    }
}