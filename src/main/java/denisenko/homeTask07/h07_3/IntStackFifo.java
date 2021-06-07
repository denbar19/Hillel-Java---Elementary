package denisenko.homeTask07.h07_3;



public interface IntStackFifo {

    void pushFifo(int value);

    Integer popFifo(); // remove and get value from the bottom of Stack

    Integer peekFifo();

    int [] toArray();

    int size();

}
