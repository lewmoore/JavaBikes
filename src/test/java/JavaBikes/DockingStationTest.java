package JavaBikes;

        import org.assertj.core.api.Assertions;
        import org.junit.Test;


public class DockingStationTest {
    DockingStation dockingStation = new DockingStation();


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
        dockingStation.addBike("Bike");
        Assertions.assertThat(dockingStation.bikesArray).contains("Bike");
    }

}
