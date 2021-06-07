package denisenko.homeTask07;

import denisenko.homeTask07.h07_2.IntList;
import denisenko.homeTask07.h07_2.IntStack;
import denisenko.homeTask07.h07_2.IntStackImpl;
import denisenko.homeTask07.h07_3.IntStackFifo;
import denisenko.homeTask07.h07_3.IntStackImplFifo;

import java.util.Arrays;

import static denisenko.homeTask07.h07_1.StringRecursive.printElement;

/**
 * 2.Написать класс, который реализует interface IntStack:
 * 3. Написать реализацию IntStack из предыдущего задания, который при переполнении теряет элементы снизу.
 */
public class Main {

    public static void main(String[] args) {

        String[] array = {"1", "house", "2", "flat", "3", "corner"};
        printElement(array, 0);
        System.out.println("\n" + "_________________________");

        IntStack stack = new IntStackImpl();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        for (int i = 0; i < 10; i++) {
            stack.push(4 + i);
        }
        System.out.println("After adding " + Arrays.toString(stack.toArray())); // 1 - 13

        System.out.println("peek " + stack.peek()); // 13

        System.out.println("pop " + stack.pop()); // 13
        System.out.println("After pop " + Arrays.toString(stack.toArray())); // 1 - 12

        System.out.println("_________________________");

        IntList list = new IntStackImpl();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("After add " + Arrays.toString(list.toArray()));

        list.insert(2, 1);
        System.out.println("After insert " + Arrays.toString(list.toArray())); // 5 4 1 3 2 1

        list.set(4, 1);
        System.out.println("After set " + Arrays.toString(list.toArray())); // 5 4 1 3 1 1

        System.out.println("size " + list.size());
        System.out.println("capacity " + list.capacity());
        System.out.println("getByIndex " + list.getByIndex(3)); // 3
        System.out.println("getIndexByValue " + list.getIndexByValue(4)); // 1
        System.out.println("contains " + list.contains(3));

        list.removeByIndex(0);
        System.out.println("After removeByIndex " + Arrays.toString(list.toArray())); // 4 1 3 1 1

        list.removeValue(3);
        System.out.println("After removeByValue " + Arrays.toString(list.toArray())); // 4 1 1 1
        System.out.println("size " + list.size()); // 4

        IntList list1 = new IntStackImpl();
        list1 = list.subList(2,3);
        System.out.println("sublist " + Arrays.toString(list1.toArray())); // 1 1
        System.out.println("_________________________");

        IntStackFifo stackFifo = new IntStackImplFifo();
        for (int i = 0; i < 10; i++) {
            stackFifo.pushFifo(i);
        }
        System.out.println("Before overflowing " + Arrays.toString(stackFifo.toArray())); // 0 - 9
        stackFifo.pushFifo(88);
        stackFifo.pushFifo(77);
        stackFifo.pushFifo(66);

        System.out.println("After overflowing " + Arrays.toString(stackFifo.toArray()));// 8 7 2 - 9
        System.out.println("size " + stackFifo.size());
        System.out.println("pop '66' " + stackFifo.popFifo());
        System.out.println("After pop " + Arrays.toString(stackFifo.toArray())); // 8 - 9

        System.out.println("pop '77' " + stackFifo.popFifo());
        System.out.println("After pop " + Arrays.toString(stackFifo.toArray()));

        System.out.println("pop '88' " + stackFifo.popFifo());
        System.out.println("After pop " + Arrays.toString(stackFifo.toArray()));
        System.out.println("size " + stackFifo.size());

        System.out.println("pop '9' " + stackFifo.popFifo());
        System.out.println("After pop " + Arrays.toString(stackFifo.toArray())); // 2 - 9

        System.out.println("pop '8' " + stackFifo.popFifo());
        System.out.println("After pop " + Arrays.toString(stackFifo.toArray())); // 2 - 8

        System.out.println("pop '7' " + stackFifo.popFifo());
        System.out.println("pop '6' " + stackFifo.popFifo());
        System.out.println("pop '5' " + stackFifo.popFifo());
        System.out.println("pop '4' " + stackFifo.popFifo());

        System.out.println("After pop " + Arrays.toString(stackFifo.toArray()));
        System.out.println("peek " + stackFifo.peekFifo()); // 8
    }
}
