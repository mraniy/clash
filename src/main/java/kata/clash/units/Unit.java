package kata.clash.units;

public abstract class Unit {

    protected int defensiveHitpoints;
    protected int offensiveHitpoints;

    protected String receiveHit(int attackHitpoints, String errorMessage) {
        String messageReturned="";
        this.defensiveHitpoints = this.defensiveHitpoints - attackHitpoints;
        if (defensiveHitpoints <= 0) {
            messageReturned= errorMessage ;
        }

        return messageReturned;
    }

    public int getDefensiveHitpoints() {
        return defensiveHitpoints;
    }
    private void setDefensiveHitpoints(int defensiveHitpoints) {
        this.defensiveHitpoints = defensiveHitpoints;
    }
    public int getOffensiveHitpoints() {
        return offensiveHitpoints;
    }
    private void setOffensiveHitpoints(int offensiveHitpoints) {
        this.offensiveHitpoints = offensiveHitpoints;
    }
}
