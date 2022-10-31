/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeontester;

/**
 *
 * @author jeffr
 */
public class Exit extends Encounter {

    private DungeonCell empty;

    public Exit() {
        empty = null;
    }

    public Exit(String player1, int health, int attack,
            int speed, int defense2, int Exp, int herolv) {
        super("Exit", health, attack, speed, defense2, Exp, herolv);

    }

    public String getname1() {
        return getN();
    }

    public String toString() {
        return getname1();
    }
}
