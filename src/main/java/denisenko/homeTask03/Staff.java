package denisenko.homeTask03;

public interface Staff {

    String employeeInfo(int id);

    Employee changeTitleEmployee(int idEmployee, int[] subordinates);

    int[] info(int id);
}
