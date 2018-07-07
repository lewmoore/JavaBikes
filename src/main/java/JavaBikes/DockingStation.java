package JavaBikes;


import java.util.ArrayList;

public class DockingStation {

    ArrayList<String> bikesArray = new ArrayList<>(20);

    public String addBike(String bike){
        bikesArray.add(bike);
        return "Bike Added";
    }
}
