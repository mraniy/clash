package kata.clash.exceptions;

public class Verifications {



    public static boolean areBlueElixirAndGemsUnitsNotLogicallyRelated(int gems, int blueElixir) {
        return !((gems / 2 == blueElixir / 500) || (gems / 5 == blueElixir / 200));
    }

    public static boolean areGemsAndElixirNotMultiplesOfTheirUnits(int gems, int blueElixir) {
        return !(((gems % 2 == 0) && (blueElixir % 500 == 0)) || ((gems % 5 == 0) && (blueElixir % 200 == 0)));
    }

    public static boolean areGemsOrBlueElixirInsufficient(int gems, int blueElixir) {
        return gems < 2 || blueElixir < 200;
    }
}
