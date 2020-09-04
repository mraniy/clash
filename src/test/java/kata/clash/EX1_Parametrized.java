package kata.clash;

import kata.clash.buildings.BlackElixirFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class EX1_Parametrized {

    @Parameterized.Parameter(value = 0)
    public int unitOfGems;

    @Parameterized.Parameter(value = 1)
    public int unitOfBlueElixir;


    @Parameterized.Parameter(value = 2)
    public int expectedBlackElixir;


    @Parameterized.Parameters(name = "{index}: with {0} of gems and {1} of blue elixir we should obtain {2} black elixir")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 500,100},
                {4, 1000,200},
                {5, 200,100}
        });
    }

    @Test
    public void with_x_gems_and_y_blueelixir_should_produce_z_blackelixir() throws Exception {

        // when
        int producedElixir = BlackElixirFactory.produceElixir(unitOfGems, unitOfBlueElixir);
        // then
        assertThat(producedElixir, is(expectedBlackElixir));

    }
}
