package com.auto;

import java.util.Random;

/**
 * Created by orad on 08.09.2016.
 */
public class Enemy {
    private int strength;
    private int power;

    public Enemy (int strength, int power) {
        this.strength = strength;
        this.power = power;
    }

    public int getStrength() {
        Random random = new Random();
        return random.nextInt(strength);

    }

    public int getPower() {
        Random random = new Random();
        return random.nextInt(power);
    }

}
