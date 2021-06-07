package denisenko.homeTask17.h17_2;

/**
 * 2. Написать тесты для класса, который одновременно реализует интерфейсы IntStack и IntList из ДЗ 7.
 * Сценарии:
 * после создания объекта в нем нет элементов
 * после добавления нескольких элементов они хранятся под правильными индексами (первый добавленный - 0 индекс, второй - 1 индекс и т.д.)
 * после удаления элемента из середины - индексы сдвигаются.
 * при обращении к элементу по индексу, который выходит за рамки - бросается исключение ArrayIndexOutOfBoundException
 * subList возвращает подсписок
 * pop удаляет с конца
 * push добавляет в конец
 */
public class IntStackImpl implements IntStack, IntList {

    private int size = 10;
    private int[] stack = new int[size];
    private int stackTop = -1;

    @Override
    public void push(int value) {
        if (stackTop == (size - 1)) {
            size = size + (size / 3 * 2);
            int[] stackLarger = new int[size];
            System.arraycopy(stack, 0, stackLarger, 0, stackTop + 1);
            stack = stackLarger;
            System.out.println("Stack is ful and now 1.5 of stackSize");
        }
        stackTop++;
        stack[stackTop] = value;

    }

    @Override
    public Integer pop() {
        if (stackTop == -1) {
            System.out.println("Stack is empty");
            return null;
        } else {
            int element = stack[stackTop];
            removeByIndex(stackTop);
            return element;
        }
    }

    @Override
    public Integer peek() {
        if (stackTop != -1) {
            return stack[stackTop];
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    //    __________________________________

    @Override
    public void add(int i) {
        push(i);
    }

    @Override
    public void insert(int index, int value) throws ArrayIndexOutOfBoundsException {
        try {
            if (indexValidation(index)) {
                stackTop++;
                int end = stack.length - 1;
                for (int i = end; i >= index; i--) {
                    stack[i] = stack[i - 1];
                }
                stack[index] = value;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter valid  index\n" + e.getMessage());
        }
    }

    @Override
    public void set(int index, int value) {
        try {
            if (indexValidation(index)) {
                stack[index] = value;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter valid  index\n" + e.getMessage());
        }
    }

    @Override
    public int size() {
        return stackTop + 1;
    }

    @Override
    public int capacity() {
        return size;
    }

    @Override
    public Integer getByIndex(int index) {
        if (indexValidation(index)) {
            return stack[index];
        }
        System.out.println("Enter valid index within Size");
        return null;
    }

    public Integer getIndexByValue(int value) {
        int index = 0;
        for (int i = 0; i <= stackTop; i++) {
            if (stack[i] == value) {
                return index = i;
            }
        }
        return index;
    }

    @Override
    public boolean contains(int value) {
        boolean contain = false;
        for (int i : stack) {
            if (stack[i] == value) {
                contain = true;
                break;
            }
        }
        return contain;
    }

    @Override
    public void removeValue(int value) {
        removeByIndex(getIndexByValue(value));
    }

    @Override
    public void removeByIndex(int index) { //moving elements leftward
        if (indexValidation(index)) {
            int end = stackTop;
            for (int i = index; i <= end; i++) {
                stack[i] = stack[i + 1];
            }
            stackTop--;
        } else {
            System.out.println("index is out of bounds ");
        }
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        if (!(indexValidation(fromIndex) && (toIndex <= stackTop))) {
            throw new IndexOutOfBoundsException("Your indexes are out of bounds of the stack");
        } else {
            IntList subList = new IntStackImpl();
            int end = fromIndex + (toIndex - fromIndex);
            for (int i = fromIndex; i <= end; i++) {
                subList.add(stack[i]);
            }
            return subList;
        }
    }

    @Override
    public int[] toArray() {
        int[] stackView = new int[stackTop + 1];
        System.arraycopy(stack, 0, stackView, 0, stackView.length);
        return stackView;
    }

    public boolean indexValidation(int index) throws ArrayIndexOutOfBoundsException {
        if (!(index >= 0)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return true;
    }
}
