package JavaBikes;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BikeTest {

    private Bike bike = new Bike();

    @Test
    public void IsInstanceOfBike()
    {
        Assertions.assertThat(bike).isInstanceOf(Bike.class);
    }
}
