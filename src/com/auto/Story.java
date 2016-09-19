package com.auto;

/**
 * Created by orad on 08.09.2016.
 */
public class Story {
    public static void main(String[] args)
    {
        Kingdom Stormhold = new Kingdom();

        while (Stormhold.canFight()) {
            Stormhold.attack();
            Stormhold.defend(10);

            System.out.println(Stormhold.canFight());



        }
        Enemy enemy = new Enemy(100,100);

        System.out.println(enemy.getStrength()+ ";" + enemy.getPower());
    }
}


