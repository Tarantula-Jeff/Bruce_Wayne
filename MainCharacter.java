/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeontester;

/**
 *
 * @author jeffr
 */
public class MainCharacter extends Encounter {

    private int heroLevel;

    public MainCharacter(String player1, int health, int attack,
            int speed, int defense2, int Exp, int herolv) {
        super(player1, health, attack, speed, defense2, Exp, herolv);

    }

    public MainCharacter() {
    }

    public int getDef() {
        return getDefence();
    }

    public String getNom() {
        return getN();
    }

    public String toString() {
        return getNom();
    }

    public int gethealth() {
        return getHealth();
    }

    public int getspeed() {
        return getSpeed();
    }

    public int getherolevel() {
        return getHeroLevel();
    }

    public int getexp() {
        return getExp();
    }

    public int getatk() {
        return getAttack();
    }

}
