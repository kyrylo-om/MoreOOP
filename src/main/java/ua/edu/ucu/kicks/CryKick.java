package ua.edu.ucu.kicks;
import ua.edu.ucu.Character;

public class CryKick extends Kick {
    @Override
    public void kick(Character kicker, Character kicked) {
        toCry();
    }

    private void toCry() {
        System.out.println("Wawaaaa :(");
    }
}
