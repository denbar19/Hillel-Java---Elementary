package denisenko.homeTask03;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Написать класс Employee (сотрудник) c полями:
 * <p>
 * ID
 * имя
 * фамилия
 * зарплата
 * Необходимые конструкторы:
 * <p>
 * Для имени и фамилии
 * Для имени, фамилии и зарплаты
 * ID должен быть целым числом и для каждого нового сотрудника увеличиваться на 1.
 * <p>
 * Написать класс Manager, который расширяет класс Employee. У него должно быть поле "подчиненные" (int[]), в котором будут храниться ID подчиненных.
 * <p>
 * В main-методе создать 3 сотрудника и 2 менеджера, распределить сотрудников между менеджерами.
 * <p>
 * Помните, что один конструктор можно вызывать из другого (передавать значения по умолчанию) и что дублирование кода - это плохо
 */
public class Main03 {

    public static void main(String[] args) {

        String[][] peopleInfo = {
                {
                        "Stanislav", "Denisenko", "12345", "UAH"
                },
                {
                        "Masha", "Kovalenko", "25000", "UAH"
                },
                {
                        "Viktoria", "Kuznichenko", "600", "USD"
                },
                {
                        "Alexander", "Pigarev", "30000", "UAH"
                },
                {
                        "Kolya", "Bondarenko", "54321", "UAH"
                }
        };

        ArrayList<Employee> staff = new ArrayList<>();
        for (int i = 0; i < peopleInfo.length; i++) {
            String id = Integer.toString(i);
            Employee employee = new Employee(id, peopleInfo[i][0],
                    peopleInfo[i][1], peopleInfo[i][2], peopleInfo[i][3]);
            staff.add(employee);
            System.out.println("You created " + id + " employee");
        }


        System.out.println("\n" + "Before changing employee Title ");
        for (int id = 0; id < staff.size(); id++) {
            System.out.println(staff.get(id).employeeInfo(id));
        }
        System.out.println();

        int id = 0;
        int forth = 4;
        int fifth = 5;
        int[] subordinates = {forth, fifth};

        staff.set(id, staff.get(id).changeTitleEmployee(id, subordinates));
        System.out.println("You changed Title Employee to Manager for id = "
                + id + ", subordinates id's = " + forth + ", " + fifth);
        System.out.println(id + " ManagersInfo " + ", subordinates are = " +
                Arrays.toString(staff.get(id).info(id)));


        int secondId = 1;
        int second = 2;
        int third = 3;
        int[] secondSubordinates = {second, third};

        staff.set(secondId, staff.get(secondId).changeTitleEmployee(secondId, secondSubordinates));
        System.out.println("You changed Title Employee to Manager for id = "
                + secondId + ", subordinates id's = " + second + ", " + third);
        System.out.println(secondId + " ManagersInfo " + ", subordinates are = " +
                Arrays.toString((staff.get(secondId).info(secondId))));


        System.out.println("\n" + "After changing employee Title ");
        for (int id2 = 0; id2 < staff.size(); id2++) {
            System.out.println(staff.get(id2).employeeInfo(id2));
        }


    }
}