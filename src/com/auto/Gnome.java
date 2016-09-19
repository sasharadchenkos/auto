package com.auto;

/**
 * Created by orad on 08.09.2016.
 */
public class Gnome extends Character implements IShooter, IWarior{
    public Gnome() {
        super(40, 15);
    }

    public void makeShot() {
        System.out.println("Gnom use a litle bow");
    }

    public void makeHit() {
        System.out.println("Who wish to taste Gnome Axe?");
    }
}
