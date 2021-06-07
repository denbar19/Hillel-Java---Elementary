package denisenko.homeTask02;

public class ServiceElevator extends ObjectElevator {

    protected ServiceElevator(String key) {
        if (key.equals("Service")) {
            this.length = 2;
            this.width = 1.5;
            this.height = 2.3;
            this.maxWeight = 1000;
            this.minWeight = 20;
            this.elevatorSpeed = 1;
        }

    }

    public boolean moveToFloor(int floor, int weight) {
        House building = new House();
        int upSize = building.getHouseSizeUp();
        int downSize = building.getHouseSizeDown();
        boolean isWeightValid = minWeight <= weight & weight < maxWeight;
        boolean isFloorValid = downSize <= floor & floor <= upSize;
        if (isWeightValid && isFloorValid) {
            System.out.println("You are Cripple and you traveled with speed = "
                    + this.elevatorSpeed + "\n");
            return true;
        } else {
            System.out.println("This is Service Elevator, you need to shrink weight to "
                    + this.maxWeight + " , or Chose floor within the house" + "\n");
            return false;
        }
    }

}
