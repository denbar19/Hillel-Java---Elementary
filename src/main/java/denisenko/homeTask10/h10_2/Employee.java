package denisenko.homeTask10.h10_2;


import java.util.ArrayList;
import java.util.List;

public class Employee extends AbstractEmployee implements Comparable<Employee> {

    protected String idEmployee;
    protected String nameEmployee;
    protected String surnameEmployee;
    protected String salaryEmployee;
    protected String currencyEmployee;
    protected List<Employee> staff = new ArrayList<>();

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
        return this.idEmployee + "  " + this.nameEmployee + "  " +
                this.surnameEmployee + "  " + this.salaryEmployee + "  " + this.currencyEmployee;
    }

    public String employeeInfo() {
        return this.idEmployee + "  " + this.nameEmployee + "  " +
                this.surnameEmployee + "  " + this.salaryEmployee + "  " + this.currencyEmployee;
    }

    public String getIdEmployee() {
        return this.idEmployee;
    }

    public String getNameEmployee() {
        return this.nameEmployee;
    }

    @Override
    public String getCurrency() {
        return this.currencyEmployee;
    }

    public String getSalary() {
        return this.salaryEmployee;
    }

    public Employee changeTitleEmployee(int idEmployee, int[] subordinates) {
        return new Manager(Integer.toString(idEmployee), this.nameEmployee, this.surnameEmployee,
                this.salaryEmployee, this.currencyEmployee, subordinates);
    }

    @Override
    public int compareTo(Employee o) {
        int thisId = Integer.parseInt(this.idEmployee);
        int oId = Integer.parseInt(o.idEmployee);
        if (thisId < oId) {
            return -1;
        } else if (thisId == oId) {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return employeeInfo();
    }
}

