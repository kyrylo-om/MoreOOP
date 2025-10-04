package ua.edu.ucu;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.edu.ucu.kicks.Kick;

@Data
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private Kick kick;

    public void kick(Character c) {
        kick.kick(this, c);
    };

    public boolean isAlive() {
        return hp > 0;
    }
    
    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
