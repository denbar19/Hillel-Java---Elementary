package denisenko.homeTask10.h10_2;


import java.util.Comparator;

public class EmployeeByIdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int firstId = Integer.parseInt(o1.getIdEmployee());
        int secondId = Integer.parseInt(o2.getIdEmployee());
        if (secondId < firstId){
            return -1;
        } else if(secondId == firstId){
            return 0;
        }
        return 1;
    }
}
