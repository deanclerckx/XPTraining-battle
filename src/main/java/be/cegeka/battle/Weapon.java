package be.cegeka.battle;

public class Weapon {

    private String type;

    private int amount;


    public Weapon(String type) {
        this.type = type;

        switch (type) {
            case "Axe":
                amount = 3;
                break;

            case "Sword":
                amount = 2;
                break;
            case "Spear":
                amount = 2;
                break;
            case "BareFist":
                amount = 1;
                break;
            default:

        }

    }

    public String getType() {
        return this.type;
    }

    public int getAmount() {
        return this.amount;

    }


}
