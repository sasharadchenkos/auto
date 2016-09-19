package com.auto;

/**
 * Created by orad on 08.09.2016.
 */
public class Kingdom {
    protected Elf elford = new Elf();
    protected Ork orkoni = new Ork();
    protected Gnome gnomster = new Gnome();
    protected Hobbit hobbitstein = new Hobbit();

    public void defend(int damage) {
        elford.damage(damage);
        orkoni.damage(damage);
        gnomster.damage(damage);
        hobbitstein.damage(damage);
    }

    public void attack() {
        attackEnemy();
        attackAeroEnemy();
    }

    public boolean canFight() {
        boolean canFight = false;

        if (elford.isAlive()) {
            canFight = true;
        }

        if (orkoni.isAlive()) {
            canFight = true;
        }

        if (gnomster.isAlive()) {
            canFight = true;
        }

        if (hobbitstein.isAlive()) {
            canFight = true;
        }

        return canFight;

        //boolean canFight = false;
        //
        //if (elford.isAlive() || orkoni.isAlive() || gnomster.isAlive() || hobbitstein.isAlive()) {
        //  canFight = true;
        //}
        //
        //return canFight;
    }

    private void attackEnemy() {
        IWarior []knights = {elford, orkoni, gnomster};

        for (IWarior knight: knights) {
            Character knightAsChar = (Character)knight;

            if (knightAsChar.isAlive()) {
                knight.makeHit();
            }
        }

        System.out.println("");
    }

    private void attackAeroEnemy() {
        IShooter []shooters = {elford, gnomster, hobbitstein};

        for (IShooter shooter: shooters) {
            Character shooterAsChar = (Character)shooter;

            if (shooterAsChar.isAlive()) {
                shooter.makeShot();
            }
        }

        System.out.println("");
    }
}
