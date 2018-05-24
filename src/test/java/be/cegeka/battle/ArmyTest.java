package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ArmyTest {

    @Test
    public void enrollSoldierTest() {
        Soldier soldier = new Soldier("Jef");
        Army army = new Army();
        army.enrollSoldier(soldier);

        Assertions.assertThat(army.getSoldiers()).containsExactly(soldier);
    }

    @Test
    public void getFrontmanTest() {
        Soldier soldier = new Soldier("Jef");
        Army army = new Army();
        army.enrollSoldier(soldier);
        Assertions.assertThat(army.getFrontman()).isEqualTo(soldier);
    }
}
