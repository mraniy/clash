package kata.clash.units;

import kata.clash.interfaces.TunnelUnderable;

public class Miner extends Unit implements TunnelUnderable {

	public Miner() {
		this.defensiveHitpoints = 800;
		this.offensiveHitpoints = 1200;
	}
	

    public String receiveHit(int attackHitpoints)
    {
        return super.receiveHit(attackHitpoints,"we return in the ground");
    }
    


	
}
