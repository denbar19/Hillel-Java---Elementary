package denisenko.homeTask17.h17_2;

public interface IntStack {
    void push(int value);

    Integer pop(); // remove and get value on top of Stack

    Integer peek(); // get value on top of Stack

    int[] toArray();

}
