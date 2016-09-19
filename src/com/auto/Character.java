package com.auto;

/**
 * Created by orad on 08.09.2016.
 */
abstract class Character {
    protected boolean alive = true;

    protected int strength;
    protected int power;

    public Character(int _strength, int _power) {
        strength = _strength;
        power = _power;
    }

    public void damage(int damage) {
        strength = strength - damage;

        if (strength <= 0) {
            alive = false;  // :(
        }
    }

    public boolean isAlive() {
        return alive;
    }
}
