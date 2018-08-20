package JavaBikes;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import static org.mockito.Mockito.mock;

public class DockingStationTest {

    DockingStation dockingStation = new DockingStation();
    Bike mockedBike = mock(Bike.class);

    @Test
    public void NewDockingStation(){
        Assertions.assertThat(dockingStation).isInstanceOf(DockingStation.class);
    }

    @Test
    public void HasEmptyArray(){
        Assertions.assertThat(dockingStation.bikesArray).isEmpty();
    }

    @Test
    public void AddsBikeToArray(){
        dockingStation.addBike(mockedBike);
        Assertions.assertThat(dockingStation.bikesArray).contains(mockedBike);
    }

    @Test
    public void RemoveBikeFromArray(){
        dockingStation.addBike(mockedBike);
        dockingStation.removeBike(mockedBike);
        Assertions.assertThat(dockingStation.bikesArray).isEmpty();
    }



}
