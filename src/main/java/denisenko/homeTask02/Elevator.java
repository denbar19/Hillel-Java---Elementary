package denisenko.homeTask02;

public interface Elevator {

    boolean moveToFloor(int floor, int weight); // "Button" to move
    int getMaxWeight (); // message about weight
    double getSpeed (); // message about speed.
}