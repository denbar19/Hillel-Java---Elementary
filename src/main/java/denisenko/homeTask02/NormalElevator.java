package denisenko.homeTask02;

public class NormalElevator extends ObjectElevator {

    protected NormalElevator(String key) {
        if (key.equals("Normal")) {
            this.length = 1.2;
            this.width = 1.2;
            this.height = 2;
            this.maxWeight = 200;
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
            System.out.println("You are normal man and traveled with speed = " + this.elevatorSpeed + "\n");
            return true;
        } else {
            System.out.println("Normal man you need to shrink weight to " + this.maxWeight + " , or Chose floor within the house" + "\n");
            return false;
        }
    }


}

