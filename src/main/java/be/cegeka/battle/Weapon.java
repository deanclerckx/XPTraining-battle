package be.cegeka.battle;

public abstract class Weapon {


    public Weapon() {

    }

    public int getAmount() {
        return amount;
    }

    public void setDamage(int amount) {

    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private int amount;

    public int checkOpponentsWeaponDamage(Soldier soldier) {
        return 1;
    }

}
