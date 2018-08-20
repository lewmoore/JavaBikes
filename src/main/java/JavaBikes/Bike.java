package JavaBikes;

public class Bike {

    boolean isWorking;

    public Bike(boolean status)
    {
        this.isWorking = status;
    }

    public boolean setBikeAsWorking()
    {
        return this.isWorking = true;
    }

    public boolean setBikeAsBroken()
    {
        return this.isWorking = false;
    }
}
