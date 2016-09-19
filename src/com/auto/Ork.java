package com.auto;

/**
 * Created by orad on 08.09.2016.
 */
public class Ork extends Character implements IWarior{
    public Ork() {
        super(50, 20);
    }

    public void makeHit() {
        System.out.println("Double shot by Ork's Hammer");
    }
}
