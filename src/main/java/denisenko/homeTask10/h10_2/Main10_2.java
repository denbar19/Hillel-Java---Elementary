package denisenko.homeTask10.h10_2;


import denisenko.homeTask10.h10_3.EmployeeBySalaryAndNameComparator;

import java.util.*;

/**
 * Класс Employee должен реализовывать интерфейс Comparable и сортировать сотрудников по id.
 * Написать компаратор, который сравнивает сотрудников по зарплате.
 */
public class Main10_2 {

    public static void main(String[] args) {

        Employee stas = new Employee("0", "Stanislav", "Denisenko", "12345", "UAH");
        Employee masha = new Employee("1", "Masha", "Kovalenko", "25000", "UAH");
        Employee victoria = new Employee("2", "Viktoria", "Kuznichenko", "600", "USD");
        Employee alexander = new Employee("3", "Alexander", "Pigarev", "25000", "UAH");
        Employee kolya = new Employee("4", "Kolya", "Bondarenko", "54321", "UAH");
        List<Employee> staff = new ArrayList<>();
        staff.add(stas);
        staff.add(masha);
        staff.add(victoria);
        staff.add(alexander);
        staff.add(kolya);
        System.out.println("\n" + "Before changing employee Title ");

        System.out.println(staff);

        int id = 0;
        int forth = 4;
        int fifth = 5;
        int[] subordinates = {forth, fifth};

        Employee manager1 = staff.get(id).changeTitleEmployee(id, subordinates);
        staff.set(id, manager1);
        System.out.println("\n" + "You changed Title Employee to Manager for id = "
                + id + ", subordinates id's = " + forth + ", " + fifth + "\n"
                + id + " ManagersInfo " + ", subordinates are = " +
                Arrays.toString(staff.get(id).getManagerInfo(id)));

        int secondId = 1;
        int second = 2;
        int third = 3;
        int[] secondSubordinates = {second, third};

        staff.set(secondId, staff.get(secondId).changeTitleEmployee(secondId, secondSubordinates));
        System.out.println("You changed Title Employee to Manager for id = "
                + secondId + ", subordinates id's = " + second + ", " + third + "\n"
                + secondId + " ManagersInfo " + ", subordinates are = " +
                Arrays.toString((staff.get(secondId).getManagerInfo(secondId))));

        EmployeeByIdComparator comparatorId = new EmployeeByIdComparator();
        Collections.sort(staff, comparatorId);
        System.out.println("\n" + staff);

        Collections.sort(staff); // by ID backwards
        System.out.println("\n" + staff);


        EmployeeBySalaryAndNameComparator comparatorSalary = new EmployeeBySalaryAndNameComparator();
        Collections.sort(staff, comparatorSalary);
        System.out.println("\n" + staff);


    }
}