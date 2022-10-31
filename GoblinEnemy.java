/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeontester;

/**
 *
 * @author jeffr
 */
public class GoblinEnemy extends Encounter {

    public GoblinEnemy(int health, int attack,
            int speed, int defense, int Exp, int herolv) {
        super("Goblin", health, attack, speed, defense, Exp, herolv);
    }

    public GoblinEnemy() {
    }

    public int getDefG() {
        return getDefence();
    }

    public void g() {
        System.out.println(getDefG());
    }

    public String getNom() {
        return getN();
    }

    public String toString() {
        return getNom();
    }

    public int gethealthG() {
        return getHealth();
    }

    public int getspeedG() {
        return getSpeed();
    }

    public int getexpG() {
        return getExp();
    }

    public int getatkG() {
        return getAttack();
    }

}
