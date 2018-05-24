package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class WeaponTest {

    Soldier soldierJef;

    Soldier soldierHans;


    @Before
    public void setUp() {
        soldierJef = new Soldier("Jef");
        soldierHans = new Soldier("Hans");
        soldierJef.setWeapon(new Sword());
        soldierHans.setWeapon(new MagicPotion());
    }

    @Test
    public void MagicPotionTestEven() {

        int enemyDamage = soldierHans.getWeapon().checkOpponentsWeaponDamage(soldierJef);
        soldierHans.getWeapon().setDamage(enemyDamage);
        Assertions.assertThat(soldierHans.getWeapon().getAmount()).isEqualTo(10);
    }

    @Test
    public void MagicPotionTestOdd() {
        soldierJef.setWeapon(new Axe());
        int enemyDamage = soldierHans.getWeapon().checkOpponentsWeaponDamage(soldierJef);
        soldierHans.getWeapon().setDamage(enemyDamage);
        Assertions.assertThat(soldierHans.getWeapon().getAmount()).isEqualTo(0);
    }

}
