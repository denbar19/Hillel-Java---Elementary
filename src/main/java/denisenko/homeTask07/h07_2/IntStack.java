package denisenko.homeTask07.h07_2;

public interface IntStack {
    void push(int value);

    Integer pop(); // remove and get value on top of Stack

    Integer peek(); // get value on top of Stack

    int[] toArray();

}
