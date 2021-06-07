package denisenko.homeTask03;

import java.util.ArrayList;

public class Employee extends AbstractEmployee {

    protected String idEmployee;
    protected String nameEmployee;
    protected String surnameEmployee;
    protected String salaryEmployee;
    protected String currencyEmployee;
    protected ArrayList<Employee> staff = new ArrayList<>();

    protected Employee(String id, String name, String surname, String salary, String currency) {
        idEmployee = id;
        nameEmployee = name;
        surnameEmployee = surname;
        salaryEmployee = salary;
        currencyEmployee = currency;
    }

    protected Employee(String id, String name, String surname, String salary) {
        this(id, name, surname, salary, "UAN");
    }

    protected Employee(String id, String name, String surname) { // basic 2
        this(id, name, surname, "20000", "UAN");
    }

    protected Employee(String name, String surname) { // basic 1
        this(name, surname, "20000", "UAN");
    }

    protected Employee() { // basic 0 // YOU ARE NOT ALLOWED DO SO
        this("name", "surname", "20000", "UAH");
    }

    public String employeeInfo(int id) {
        return idEmployee + "  " + nameEmployee + "  " +
                surnameEmployee + "  " + salaryEmployee + "  " + currencyEmployee;
    }

    public Employee changeTitleEmployee(int idEmployee, int[] subordinates) {
        return new Manager(Integer.toString(idEmployee), this.nameEmployee, this.surnameEmployee,
                this.salaryEmployee, this.currencyEmployee, subordinates);
    }

}

