package kata.clash.units;

import kata.clash.interfaces.Flyiable;

public class Dragon extends Unit implements Flyiable {

    public Dragon() {
        this.defensiveHitpoints = 5000;
        this.offensiveHitpoints = 7500;
    }


    public String ReceiveHit(int attackHitpoints) {
        return super.receiveHit(attackHitpoints,"I WILL RISE AGAIN FROM THE ASHES");
    }


}
