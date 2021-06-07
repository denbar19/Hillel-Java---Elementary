package denisenko.homeTask03;

public class Manager extends Employee {

    protected int[] subordinatesId;

    Manager(String id, String name, String surname, String salary, String currency, int[] subordinatesId) {
        super(id, name, surname, salary);
        this.subordinatesId = subordinatesId;
    }

    @Override
    public String employeeInfo(int id) {
        StringBuilder textLine = new StringBuilder();
        StringBuilder subordinatesText = new StringBuilder();
        subordinatesText.append(subordinatesId[0]);
        for (int i = 1; i < subordinatesId.length; i++) {
            Integer.toString(i);
            subordinatesText.append(", " + i);
        }
        textLine.append(idEmployee + "  " + nameEmployee + "  " +
                surnameEmployee + "  " + salaryEmployee + "  " + currencyEmployee + " " + subordinatesText);
        return textLine.toString();
    }

    public int[] getManagerInfo(int id) {
        return subordinatesId;
    }


}
