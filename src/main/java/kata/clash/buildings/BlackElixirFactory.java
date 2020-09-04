package kata.clash.buildings;

import kata.clash.exceptions.DwarfsAngryException;
import kata.clash.exceptions.InvalidQuantityException;

import static kata.clash.exceptions.Verifications.*;

public class BlackElixirFactory {


    public static int produceElixir(int gems, int blueElixir) throws Exception {

        if (areGemsOrBlueElixirInsufficient(gems, blueElixir)) {
            throw new DwarfsAngryException();
        }

        if (areGemsAndElixirNotMultiplesOfTheirUnits(gems, blueElixir)
                || areBlueElixirAndGemsUnitsNotLogicallyRelated(gems, blueElixir)) {
            throw new InvalidQuantityException();
        }

        return getUnitsOfBlackElixir(gems, blueElixir);

    }

    private static int getUnitsOfBlackElixir(int gems, int blueElixir) {
        return ((gems % 2 == 0) && (blueElixir % 500 == 0) ? gems / 2 : gems / 5) * 100;
    }


}
