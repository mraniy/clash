package kata.clash;


import org.junit.Test;

import kata.clash.buildings.BlackElixirFactory;
import kata.clash.exceptions.DwarfsAngryException;
import kata.clash.exceptions.InvalidQuantityException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class EX1_Exceptions {


    @Test(expected = DwarfsAngryException.class)
    public void when_gems_supplied_are_not_enough_throw_dwarfsangryexception() throws Exception {
        // given
        int unitOfGems = 1;
        int unitOfBlueElixir = 500;
        // when
        BlackElixirFactory.produceElixir(unitOfGems, unitOfBlueElixir);
    }

    @Test(expected = DwarfsAngryException.class)
    public void when_blueelixir_supplied_is_not_enough_throw_dwarfsangryexception() throws Exception {
        // given
        int unitOfGems = 5;
        int unitOfBlueElixir = 100;
        // when
        BlackElixirFactory.produceElixir(unitOfGems, unitOfBlueElixir);
    }



    @Test(expected = InvalidQuantityException.class)
    public void when_gem_supplied_is_too_much_throw_invalidquantityexception() throws Exception {
        // given
        int unitOfGems = 7;
        int unitOfBlueElixir = 500;
        // when
        BlackElixirFactory.produceElixir(unitOfGems, unitOfBlueElixir);
    }

    @Test(expected = InvalidQuantityException.class)
    public void when_blue_elixir_supplied_is_too_much_throw_invalidquantityexception() throws Exception {
        // given
        int unitOfGems = 5;
        int unitOfBlueElixir = 700;
        // when
        BlackElixirFactory.produceElixir(unitOfGems, unitOfBlueElixir);
    }
    @Test(expected = InvalidQuantityException.class)
    public void when_blue_elixir_1500_and_gems_is_4_throw_invalidquantityexception() throws Exception {
        // given
        int unitOfGems = 4;
        int unitOfBlueElixir = 1500;
        // when
        BlackElixirFactory.produceElixir(unitOfGems, unitOfBlueElixir);
    }

    @Test(expected = InvalidQuantityException.class)
    public void when_blue_elixir_600_and_gems_is_15_throw_invalidquantityexception() throws Exception {
        // given
        int unitOfGems = 20;
        int unitOfBlueElixir = 600;
        // when
        BlackElixirFactory.produceElixir(unitOfGems, unitOfBlueElixir);
    }




}
