/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeontester;

/**
 *
 * @author jeffr
 */
public class Empty extends Encounter {

    public Empty(String player1, int health, int attack,
            int speed, int defense2, int Exp, int herolv) {
        super("Empty", health, attack, speed, defense2, Exp, herolv);

    }

    public Empty() {
    }

    public String getname1() {
        return getN();
    }

    public String toString() {
        return getname1();
    }

}
