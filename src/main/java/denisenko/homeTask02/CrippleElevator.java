package denisenko.homeTask02;

public class CrippleElevator extends ObjectElevator {

    CrippleElevator(String key) {
        if (key.equals("Cripple")) {
            this.length = 1.5;
            this.width = 1.2;
            this.height = 2;
            this.maxWeight = 300;
            this.minWeight = 20;
            this.elevatorSpeed = 0.7;
        }
    }

    public boolean moveToFloor(int floor, int weight) {
        House building = new House();
        int upSize = building.getHouseSizeUp();
        int downSize = building.getHouseSizeDown();
        boolean isWeightValid = minWeight <= weight & weight < maxWeight;
        boolean isFloorValid = downSize <= floor & floor <= upSize;
        if (isWeightValid && isFloorValid) {
            System.out.println("This is Service Elevator and you traveled with speed = "
                    + this.elevatorSpeed + "\n");
            return true;
        } else {
            System.out.println("This is Service Elevator, you need to shrink weight to "
                    + this.maxWeight + " , or Chose floor within the house" + "\n");
            return false;
        }
    }
}
