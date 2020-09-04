package kata.clash.units;

import kata.clash.interfaces.Runnable;

public class Bomber extends Unit implements Runnable {
	public Bomber() {
		this.defensiveHitpoints = 350;
		this.offensiveHitpoints = 800;
	}

    public String ReceiveHit(int attackHitpoints)
    {
        return super.receiveHit(attackHitpoints,"WHEN YOU play with Explosives is dangerous bussiness");
    }


}
