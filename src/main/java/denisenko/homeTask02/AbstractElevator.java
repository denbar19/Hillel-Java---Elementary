package denisenko.homeTask02;

public abstract class AbstractElevator implements Elevator {

    protected int getMaxWeight;
    protected double getSpeed;

    public abstract boolean moveToFloor(int floor, int weight);

    public int getMaxWeight() {
        return getMaxWeight;
    }

    public double getSpeed() {
        return getSpeed;
    }


}
