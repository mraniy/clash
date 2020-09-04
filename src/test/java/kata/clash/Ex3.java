package kata.clash;

import kata.clash.units.Bomber;
import kata.clash.units.Dragon;
import kata.clash.units.Giant;
import kata.clash.units.Miner;
import org.junit.Assert;
import org.junit.Test;

public class Ex3 {

	
	/* Q1 */ 
    @Test
    public void with_dragon_unit_for_1_second_then_it_should_fly_and_cover_8_map_spaces()
    {
        Dragon dragonUnit = new Dragon();
        int timeForMovementSeconds = 1;
        int expectedCoveredDistance = 8;

        int actualCoveredDistance = dragonUnit.move(timeForMovementSeconds);

        Assert.assertEquals(expectedCoveredDistance, actualCoveredDistance);
    }

  //  @Test
  //  @Ignore
  //  public void With_Bomber_Unit_For_1_second_Then_It_Should_Walk_And_Cover_3_Map_Spaces()
  //  {
   //     Bomber bomberUnit = new Bomber();
   //     int timeForMovementSeconds = 1;
   //     int expectedCoveredDistance = 3;

   //     int actualCoveredDistance = bomberUnit.move(timeForMovementSeconds);

   //     Assert.assertEquals(expectedCoveredDistance, actualCoveredDistance);
    //}

    @Test
    public void with_giant_unit_for_1_second_then_it_should_walk_and_cover_3_map_spaces()
    {
        Giant giantUnit = new Giant();
        int timeForMovementSeconds = 1;
        int expectedCoveredDistance = 3;

        int actualCoveredDistance = giantUnit.move(timeForMovementSeconds);

        Assert.assertEquals(expectedCoveredDistance, actualCoveredDistance);
    }

    @Test
    public void with_miner_unit_for_1_second_then_it_should_tunnelunder_and_cover_5_map_spaces()
    {
        Miner minerUnit = new Miner();
        int timeForMovementSeconds = 1;
        int expectedCoveredDistance = 5;

        int actualCoveredDistance = minerUnit.move(timeForMovementSeconds);

        Assert.assertEquals(expectedCoveredDistance, actualCoveredDistance);
    }
    
    /* Q2 */
    
    	@Test
        public void with_bomber_unit_for_1_second_then_it_should_run_and_cover_6_map_spaces()
        {
            Bomber bomberUnit = new Bomber();
            int timeForMovementSeconds = 1;
            int expectedCoveredDistance = 6;

            int actualCoveredDistance = bomberUnit.move(timeForMovementSeconds);

            Assert.assertEquals(expectedCoveredDistance, actualCoveredDistance);
        }

    	@Test
       public void with_bomber_unit_for_6_second_then_it_should_run_and_cover_36_map_spaces()
        {
        	Bomber bomberUnit = new Bomber();
            int timeForMovementSeconds = 6;
            int expectedCoveredDistance = 36;

            int actualCoveredDistance = bomberUnit.move(timeForMovementSeconds);

            Assert.assertEquals(expectedCoveredDistance, actualCoveredDistance);
        }
    
}
