
package ua.edu.ucu;

public class GameManager {
    public void fight(Character c1, Character c2) {

        String name1 = c1.getClass().getSimpleName();
        String name2 = c2.getClass().getSimpleName();

        System.out.println("\n\nBattle between " + name1 + " and " + name2 + " begins!");
        System.out.println(c1 + " vs. " + c2 + "\n");
        
        while (true) {
            System.out.println("------------------------\n");
            System.out.println(name1 + " attacks " + name2 + "!");
            c1.kick(c2);
            System.out.println("Current stats: " + c1 + " | " + c2 + "\n");
            if (!c2.isAlive()) {
                System.out.println(name2 + " died! " + name1 + " wins!");
                break;
            }
            System.out.println("------------------------\n");
            System.out.println(name2 + " attacks " + name1 + "!");
            c2.kick(c1);
            System.out.println("Current stats: " + c1 + " | " + c2 + "\n");
            if (!c1.isAlive()) {
                System.out.println(name1 + " died! " + name2 + " wins!");
                break;
            }
        }
    }
}