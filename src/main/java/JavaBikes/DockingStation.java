package JavaBikes;


import java.util.ArrayList;

public class DockingStation {

    ArrayList<Bike> bikesArray;

    public DockingStation()
    {
       this.bikesArray = new ArrayList<>(20);
    }

    public String addBike(Bike bike){
        bikesArray.add(bike);
        return "Bike Added";
    }

    public String removeBike(Bike bike){
        if (bike.getStatus()){
            bikesArray.remove(bike);
            return "Bike removed successfully";
        }
        return "This bike is broken";
    }

}
