package denisenko.homeTask03;

public abstract class AbstractEmployee implements Staff {

    protected int[] info;

    public abstract String employeeInfo(int id);

    public abstract Employee changeTitleEmployee(int idEmployee, int[] subordinates);

    public int[] info(int id) {
        return info;
    }
}

