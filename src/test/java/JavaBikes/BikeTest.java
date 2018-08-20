package JavaBikes;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BikeTest {

    private Bike bike = new Bike(true);

    @Test
    public void IsInstanceOfBike()
    {
        Assertions.assertThat(bike).isInstanceOf(Bike.class);
    }

    @Test
    public void BikeIsWorkingByDefault()
    {
        Assertions.assertThat(bike.isWorking).isEqualTo(true);
    }

    @Test
    public void SetBikeToWorking()
    {
        bike.setBikeAsWorking();
        Assertions.assertThat(bike.isWorking).isEqualTo(true);
    }

    @Test
    public void SetBikeAsBroken()
    {
        bike.setBikeAsBroken();
        Assertions.assertThat(bike.isWorking).isEqualTo(false);
    }
}
