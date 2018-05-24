package be.cegeka.battle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FightTest {

    @Test
    public void soldierFight() {
        Soldier duitser = new Soldier("Jef");
        Soldier brit = new Soldier("Harold");
        duitser.addWeapon("BareFist");
        brit.addWeapon("Sword");
        Soldier winner = duitser.valtAan(brit);
        assertThat(winner.getName()).isEqualTo(brit.getName());

    }


}
