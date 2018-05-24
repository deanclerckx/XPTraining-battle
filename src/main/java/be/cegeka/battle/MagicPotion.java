package be.cegeka.battle;


public class MagicPotion extends Weapon {

    public MagicPotion() {

    }


    @Override
    public void setDamage(int amount) {
        if (amount % 2 == 0) {
            this.setAmount(10);
        } else {
            this.setAmount(0);
        }
    }

    @Override
    public int checkOpponentsWeaponDamage(Soldier soldier) {
        return soldier.getWeapon().getAmount();
    }
}
