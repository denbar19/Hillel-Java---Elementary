package denisenko.homeTask02;

public class ObjectElevator extends AbstractElevator {
    double length;
    double width;
    double height;
    int maxWeight;
    int minWeight;
    double elevatorSpeed;

    public boolean moveToFloor(int floor, int weight) {
        House building = new House();
        int upSize = building.getHouseSizeUp();
        int downSize = building.getHouseSizeDown();
        boolean isWeightValid = minWeight <= weight & weight < maxWeight;
        boolean isFloorValid = downSize <= floor & floor <= upSize;
        if (isWeightValid && isFloorValid) {
            System.out.println("You've traveled with speed = " + this.elevatorSpeed + "\n");
            return true;
        } else {
            System.out.println("Shrink weight to " + this.maxWeight + " , or Chose floor within the house");
            return false;
        }
    }


    @Override
    public int getMaxWeight() {
        return this.maxWeight;
    }

    @Override
    public double getSpeed() {
        return this.elevatorSpeed;
    }


}

