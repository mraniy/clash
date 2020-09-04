package kata.clash;

import org.junit.Assert;
import org.junit.Test;

import kata.clash.buildings.BlackTrainingCamp;
import kata.clash.buildings.BlueTrainingCamp;
import kata.clash.units.Bomber;
import kata.clash.units.Dragon;
import kata.clash.units.Giant;
import kata.clash.units.Miner;
import kata.clash.units.UnitType;

public class Ex2 {

	/* Q1 */

	@Test
	public void a_dragon_then_it_should_have_7500_getoffensivehitpoints() {
		Dragon newlyCreatedDragon = BlackTrainingCamp.ProduceUnit(UnitType.DRAGON);

		Assert.assertEquals(7500, newlyCreatedDragon.getOffensiveHitpoints());
	}

	@Test
	public void a_dragon_then_it_should_have_5000_getdefensivehitpoints() {
		Dragon newlyCreatedDragon = BlackTrainingCamp.ProduceUnit(UnitType.DRAGON);

		Assert.assertEquals(5000, newlyCreatedDragon.getDefensiveHitpoints());
	}

	@Test
	public void a_bomber_then_it_should_have_800_getoffensivehitpoints() {
		Bomber newlyCreatedBomber = BlueTrainingCamp.ProduceBomber();

		Assert.assertEquals(800, newlyCreatedBomber.getOffensiveHitpoints());
	}

	@Test
	public void a_bomber_then_it_should_have_350_getdefensivehitpoints() {
		Bomber newlyCreatedBomber = BlueTrainingCamp.ProduceBomber();

		Assert.assertEquals(350, newlyCreatedBomber.getDefensiveHitpoints());
	}

	@Test
	public void a_giant_then_it_should_have_3000_getoffensivehitpoints() {
		Giant newlyCreatedGiant = BlueTrainingCamp.ProduceGiant();

		Assert.assertEquals(3000, newlyCreatedGiant.getOffensiveHitpoints());
	}

	@Test
	public void a_giant_then_it_should_have_4500_getdefensivehitpoints() {
		Giant newlyCreatedGiant = BlueTrainingCamp.ProduceGiant();

		Assert.assertEquals(4500, newlyCreatedGiant.getDefensiveHitpoints());
	}

	@Test
	public void a_miner_then_it_should_have_1200_getoffensivehitpoints() {
		Miner newlyCreatedMiner = BlueTrainingCamp.ProduceMiner();

		Assert.assertEquals(1200, newlyCreatedMiner.getOffensiveHitpoints());
	}

	@Test
	public void a_miner_then_it_should_have_800_getdefensivehitpoints() {
		Miner newlyCreatedMiner = BlueTrainingCamp.ProduceMiner();

		Assert.assertEquals(800, newlyCreatedMiner.getDefensiveHitpoints());
	}

	@Test
	public void with_10000_offensivehitpoints_then_a_dragon_dies_and_shouts_his_last_message()
                {
                    Dragon dragonUnit = BlackTrainingCamp.ProduceUnit(UnitType.DRAGON);

                    String lastMessageBeforeDying = dragonUnit.ReceiveHit(2000);

                    Assert.assertTrue(dragonUnit.getDefensiveHitpoints() > 0);
                    Assert.assertFalse(!lastMessageBeforeDying.isEmpty());

                    lastMessageBeforeDying = dragonUnit.ReceiveHit(8000);

                    Assert.assertTrue(dragonUnit.getDefensiveHitpoints() <=0);
                    Assert.assertTrue(lastMessageBeforeDying.equals("I WILL RISE AGAIN FROM THE ASHES"));
                }

	@Test
	public void with_4501_offensivehitpoints_then_a_giant_dies_and_shouts_his_last_message()
                {
                    Giant giantUnit = BlueTrainingCamp.ProduceGiant();
                    String lastMessageBeforeDying = giantUnit.ReceiveHit(4501);

                    Assert.assertTrue(giantUnit.getDefensiveHitpoints() <= 0);
                    Assert.assertTrue(lastMessageBeforeDying.equals("OUR IRON FISTS WILL BE REMEMBERED FOREVER"));
                }

	@Test
	public void with_1300_offensivehitpoints_then_a_miner_dies_and_shouts_his_last_message()
                {
                    Miner minerUnit = BlueTrainingCamp.ProduceMiner();
                    String lastMessageBeforeDying = minerUnit.receiveHit(1300);

                    Assert.assertTrue(minerUnit.getDefensiveHitpoints() <= 0);
                    Assert.assertTrue(lastMessageBeforeDying.toLowerCase().equals("we return in the ground"));
                }

	@Test
	public void with_400_offensivehitpoints_then_a_bomber_dies_and_shouts_his_last_message()
                {
                    Bomber bomberUnit = BlueTrainingCamp.ProduceBomber();
                    String expectedMessage = "WHEN YOU play with Explosives is dangerous bussiness";
                    String lastMessageBeforeDying = bomberUnit.ReceiveHit(400);

                    Assert.assertTrue(bomberUnit.getDefensiveHitpoints() <= 0);
                    Assert.assertTrue(lastMessageBeforeDying.toLowerCase().equals(expectedMessage.toLowerCase()));
                }
}
