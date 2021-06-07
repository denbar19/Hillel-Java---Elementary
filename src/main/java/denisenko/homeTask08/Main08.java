package denisenko.homeTask08;

import denisenko.homeTask08.h08_1.QueueReverse;
import denisenko.homeTask08.h08_2.QueueClean;
import denisenko.homeTask08.h08_3.QueueUnique;

import java.util.*;

public class Main08 {

    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Fir");
        queue.add("Sec");
        queue.add("Third should be removed");
        QueueReverse queueBackwards = new QueueReverse();
        QueueClean queueClean = new QueueClean();
        System.out.println(queueBackwards.revertQueue(queue));
        System.out.println(queueClean.stringClean(queue));

        queue.add("Third should be removed");
        QueueUnique queueUniqueSet = new QueueUnique();
        queue.add("A");
        queue.add("A");
        queue.add("A");
        System.out.println(queueUniqueSet.queueUniqueSet(queue));

        queue.add("D");
        queue.add("D");
        QueueUnique queueUnique = new QueueUnique();
        System.out.println(queueUnique.queueUnique(queue));

    }
}
