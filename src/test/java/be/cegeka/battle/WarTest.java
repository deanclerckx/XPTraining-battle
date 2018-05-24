package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class WarTest {

    private Army armyBelgium;

    private Army armyGermany;

    @Before
    public void setUp() {
        Soldier soldierJef = new Soldier("Jef");
        Soldier soldierHans = new Soldier("Hans");
        soldierJef.addWeapon("Bare fist");
        soldierHans.addWeapon("Axe");
        armyBelgium = new Army();
        armyGermany = new Army();
        armyBelgium.enrollSoldier(soldierJef);
        armyGermany.enrollSoldier(soldierHans);
    }

    @Test
    public void engageInWarTest() {
        War war = new War(armyBelgium, armyGermany);
        Assertions.assertThat(war.getAttack()).isEqualTo(armyBelgium);
        Assertions.assertThat(war.getDefense()).isEqualTo(armyGermany);
    }

    @Test
    public void fightTest() {
        War war = new War(armyBelgium, armyGermany);
        war.fight();
        Assertions.assertThat(war.getAttack().getFrontman()).isNotEqualTo(armyBelgium.getFrontman());
    }

}
