package be.cegeka.battle;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import org.apache.commons.lang3.Validate;

public final class Soldier {

    private final String name;


    private Weapon weapon = new Weapon("Bare fist");

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public void addWeapon(String weapon1) {

        Weapon weapon = new Weapon(weapon1);
        this.setWeapon(weapon);

    }

    public Soldier attacks(Soldier soldier) {
        if (soldier.getWeapon().getAmount() > this.getWeapon().getAmount()) {

            return soldier;
        }

        return this;


    }


}

