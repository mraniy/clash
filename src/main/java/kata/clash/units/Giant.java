package kata.clash.units;

import kata.clash.interfaces.Walkable;

public class Giant  extends Unit implements Walkable {


    public Giant() {
        this.defensiveHitpoints = 4500;
        this.offensiveHitpoints = 3000;
    }



    public String ReceiveHit(int attackHitpoints) {
        return super.receiveHit(attackHitpoints,"OUR IRON FISTS WILL BE REMEMBERED FOREVER");
    }



}
