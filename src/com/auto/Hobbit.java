package com.auto;

/**
 * Created by orad on 08.09.2016.
 */
public class Hobbit extends Character implements IShooter {
    public Hobbit() {
        super(15, 20);
    }

    public void makeShot() {
        System.out.println("Hobbit make a Pistol's shot from the dark");
    }
}
