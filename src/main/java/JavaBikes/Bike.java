package JavaBikes;

public class Bike {

    boolean isWorking;

    public Bike()
    {
        this.isWorking = true;
    }

    public boolean setBikeAsWorking()
    {
        return this.isWorking = true;
    }

    public boolean setBikeAsBroken()
    {
        return this.isWorking = false;
    }

    public boolean getStatus()
    {
        return isWorking;
    }
}
