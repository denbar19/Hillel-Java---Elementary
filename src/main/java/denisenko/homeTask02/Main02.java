package denisenko.homeTask02;

/**
 * Написать иерархию классов, во главе которой находится интерфейс Elevator (лифт). Необходимые реализации:
 * пассажирский лифт
 * грузовой лифт
 * лифт для инвалидов
 * <p>
 * Перед движением лифта выполнить проверку, может ли он двигаться.
 * В Main-классе создать объекты всех реализаций, поместить их в массив, попробовать переместить каждый лифт на -3, 9999, 8 и 1 этажи.
 * Предусмотреть случаи:
 * движение лифта на тот же этаж, где он сейчас находится
 * перегруз лифта
 */
public class Main02 {

    public static void main(String[] args) {
        int defaultUpStairs = 9;
        int defaultDownStairs = 2;
        int weight = 160;
        int[] floorsToMove = {-3, 9999, 8, 1};
        int presentFloor = 3;

        Elevator normalElevator = new NormalElevator("Normal");
        Elevator serviceElevator = new ServiceElevator("Service");
        Elevator CrippleElevator = new CrippleElevator("Cripple");

        Elevator[] elevators = new ObjectElevator[3];
        elevators[0] = normalElevator;
        elevators[1] = serviceElevator;
        elevators[2] = CrippleElevator;

        for (int floor : floorsToMove) {
            System.out.println("The program has began" + "\n");
            System.out.println("You've moved from the floor " + presentFloor + " to floor " + floor);
            for (Elevator elevator : elevators) {
                elevator.moveToFloor(floor, weight);
            }
        }
    }
}


