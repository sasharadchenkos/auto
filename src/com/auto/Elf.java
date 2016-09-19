package com.auto;

/**
 * Created by orad on 08.09.2016.
 */
public class Elf extends Character implements IShooter, IWarior {
    public Elf() {
        super(30, 10);
    }

    public void makeShot() {
        System.out.println("Enemy got Arrow by Elf");
    }

    public void makeHit() {
        System.out.println("Elf use his sword!");
    }
}
