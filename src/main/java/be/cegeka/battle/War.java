package be.cegeka.battle;


public class War {


    public War(Army attack, Army defense) {
        this.attack = attack;
        this.defense = defense;
    }

    private Army attack = new Army();

    private Army defense = new Army();


    public Army getAttack() {
        return attack;
    }


    public void setAttack(Army attack) {
        this.attack = attack;
    }


    public Army getDefense() {
        return defense;
    }


    public void setDefense(Army defense) {
        this.defense = defense;
    }

    public void fight() {
        while (countSoldiersInArmy(attack) > 0 && countSoldiersInArmy(defense) > 0) {
            attack.fight(defense);
        }
        if (countSoldiersInArmy(attack) != 0) {
            lastManStanding(attack);
        } else {
            lastManStanding(defense);
        }
    }

    public int countSoldiersInArmy(Army army) {
        return army.getSoldiers().size();
    }

    public void lastManStanding(Army army) {

    }


}
