/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeontester;

/**
 *
 * @author jeffr
 */
public class Encounter {

    //Character
    private String name;
    private int health;
    private int defense;
    private int exp;
    private int Atk;
    private int Speed;
    private int heroLevel;
    //goblin
    private GoblinEnemy goblin;
    private int ExperienceValue; //- 50

    public Encounter() {
    }

    public Encounter(String name1, int h, int d, int e, int a, int s, int hL) {
        name = name1;
        health = h;
        defense = d;
        exp = e;
        Atk = a;
        Speed = s;
        heroLevel = hL;

    }

    public int getDefence() {
        return defense;
    }

    public String getN() {
        return name;
    }

    public int getExp() {
        return exp;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return Speed;
    }

    public int getHeroLevel() {
        return heroLevel;
    }

    public int getAttack() {
        return Atk;
    }

}
