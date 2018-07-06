package JavaBikes;

        import org.assertj.core.api.Assertions;
        import org.junit.Test;

public class DockingStationTest {



    @Test
    public void NewDockingStation(){
        DockingStation dockingStation = new DockingStation();

        Assertions.assertThat(dockingStation).isInstanceOf(DockingStation.class);
    }

}
