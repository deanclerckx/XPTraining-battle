package be.cegeka.battle;

import java.util.ArrayList;
import java.util.List;

public class Army {


    public Army() {

    }

    private List<Soldier> soldiers = new ArrayList<Soldier>();

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

    public void enrollSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    public Soldier getFrontman() {
        return soldiers.get(0);
    }

    public void fight(Army defense) {
        if (this.getFrontman() == this.getFrontman().attacks(defense.getFrontman())) {
            defense.loseFrontman();
        } else {
            this.loseFrontman();
        }
    }

    public void loseFrontman() {
        this.soldiers.remove(this.getFrontman());
    }
}
