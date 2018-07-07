package JavaBikes;


import java.util.ArrayList;

public class DockingStation {

    ArrayList<String> bikesArray = new ArrayList<>(20);

    public String addBike(String bike){
        bikesArray.add(bike);
        return "Bike Added";
    }

    public String removeBike(String bike){
        bikesArray.remove(bike);
        return "Bike removed successfully";
    }

}
