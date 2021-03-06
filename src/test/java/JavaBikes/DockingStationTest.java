package JavaBikes;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        when(mockedBike.getStatus()).thenReturn(true);
        dockingStation.removeBike(mockedBike);
        Assertions.assertThat(dockingStation.bikesArray).isEmpty();
    }

    @Test
    public void WontReturnBrokenBike()
    {
        dockingStation.addBike(mockedBike);
        when(mockedBike.getStatus()).thenReturn(false);
        Assertions.assertThat(dockingStation.removeBike(mockedBike)).isEqualTo("This bike is broken");
    }
}
