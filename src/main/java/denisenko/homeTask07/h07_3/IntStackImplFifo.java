package denisenko.homeTask07.h07_3;

import denisenko.homeTask07.h07_2.IntStackImpl;

public class IntStackImplFifo extends IntStackImpl implements IntStackFifo {
    final int SIZE = 10;
    int[] stack = new int[SIZE];
    int stackTop = -1;
    boolean overflow = false;
    int countOverflow = 0;

    public void pushFifo(int value) {
        if (stackTop == (SIZE - 1)) {
            stackTop = 0;
            stack[stackTop] = value;
            overflow = true;
            countOverflow++;
            if (countOverflow == SIZE) {
                countOverflow = 0;
            }
            System.out.println("Stack is ful and now values will be overwritten from the beginning");
        } else {
            if (countOverflow != 0) {
                countOverflow++;
            }
            stackTop++;
            stack[stackTop] = value;
        }
    }

    @Override
    public Integer popFifo() {
        Integer element = null;
        

//        if (stackTop == -1) {
//            System.out.println("Stack is empty");
//            return element;
//        } else if (!overflow) {
//            element = stack[stackTop];
//            removeByIndex(stackTop);
//            return element;
//        } else if (overflow) {
//            if (stackTop > 0) {
//                element = stack[stackTop];
//                removeByIndex(stackTop);
//                countOverflow--;
//                return element;
//            } else if (stackTop == 0) {
//                element = stack[stackTop];
//                removeByIndex(stackTop);
//                stackTop = SIZE - 1 - countOverflow;
//                overflow = false;
//            }
//        }
//        return element;
        return element;
    }

    @Override
    public void removeByIndex(int index) { //moving elements leftward
        if (indexValidation(index)) {
            System.arraycopy(stack,1, stack, 0, stack.length - 1);
//            int length;
//            if (overflow) {
//                length = SIZE - index +1;
//            } else {
////                if (stackTop == 0){
////                    stackTop = SIZE - countOverflow;
////                }
//                length = stackTop;
//            }
//            for (int i = index; i < length; i++) {
//                stack[i] = stack[i + 1];
//            }
//            stackTop--;
//        } else {
//            System.out.println("index is out of bounds ");
        }
    }

    public Integer peekFifo() {
        if (stackTop != -1) {
            return stack[stackTop];
        } else {
            System.out.println("Stack is empty");
            return 0;
        }
    }

    @Override
    public int[] toArray() {
        if (overflow) {
            int[] stackView = new int[SIZE];
            System.arraycopy(stack, 0, stackView, 0, stackView.length);
            return stackView;
        }
        int[] stackView = new int[stackTop + 1];
        System.arraycopy(stack, 0, stackView, 0, stackView.length);
        return stackView;
    }

    @Override
    public int size() {
        if (overflow) {
            return capacity();
        }
        return stackTop;
    }

    @Override
    public int capacity() {
        return SIZE;
    }
}
