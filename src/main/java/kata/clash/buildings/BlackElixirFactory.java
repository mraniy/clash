package kata.clash.buildings;

import kata.clash.exceptions.DwarfsAngryException;
import kata.clash.exceptions.InvalidQuantityException;

public class BlackElixirFactory {
    public static int ProduceElixir(int gems, int blueElixir) throws Exception
    {
       
        if (gems < 2 || blueElixir < 200)
        {
            throw new DwarfsAngryException();
        }

        if (!(((gems % 2 == 0) && (blueElixir % 500 == 0)) || ((gems % 5 == 0) && (blueElixir % 200 == 0))))
        {
            throw new InvalidQuantityException();
        }

        if (!((gems / 2 == blueElixir / 500) || (gems / 5 == blueElixir / 200)))
        {
            throw new InvalidQuantityException();
        }

        return ((gems % 2 == 0) && (blueElixir % 500 == 0) ? gems / 2  : gems / 5 ) * 100;

    }

}
