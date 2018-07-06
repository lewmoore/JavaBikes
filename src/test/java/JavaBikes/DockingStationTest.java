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
    public void HasArrayOfFiveBikes(){
        Assertions.assertThat(dockingStation.bikesArray).hasSize(5);
    }

}
