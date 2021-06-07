package denisenko.homeTask07.h07_2;

public class IntStackImpl implements IntStack, IntList {

    int size = 10;
    int[] stack = new int[size];
    int stackTop = -1;

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
    public void insert(int index, int value) {
        if (indexValidation(index)) {
            stackTop++;
            int end = stack.length - 1;
            for (int i = end; i >= index; i--) {
                stack[i] = stack[i - 1];
            }
            stack[index] = value;
        } else {
            System.out.println("Enter valid  index");
        }
    }

    @Override
    public void set(int index, int value) {
        if (indexValidation(index)) {
            stack[index] = value;
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
    public int getByIndex(int index) {
        if (indexValidation(index)) {
            return stack[index];
        }
        System.out.println("Enter valid index within Size");
        return 0;
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
    public IntList subList(int fromIndex, int toIndex){
        if (!(indexValidation(fromIndex) && (toIndex <= stackTop))) {
            throw new IndexOutOfBoundsException("Your indexes are out of bounds of the stack");
        }else{
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

    public boolean indexValidation(int index) {
        return index >= 0;
    }

}
