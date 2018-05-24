package be.cegeka.battle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FightTest {

    @Test
    public void soldierFight() {
        Soldier duitser = new Soldier("Jef");
        Soldier brit = new Soldier("Harold");
        duitser.setWeapon(new BareFist());
        brit.setWeapon(new Sword());
        Soldier winner = duitser.attacks(brit);
        assertThat(winner.getName()).isEqualTo(brit.getName());

    }


}
