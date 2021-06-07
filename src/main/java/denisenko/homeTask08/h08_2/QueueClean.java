package denisenko.homeTask08.h08_2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 2. Написать метод, который принимает на вход очередь строк, удаляет из нее все строки, длина которых > 4 и возвращает ее.
 * Входную очередь изменять нельзя.
 */
public class QueueClean {

    public Queue<String> stringClean(Queue<String> queue) {
        Queue<String> queueClean = new LinkedList<>();
        for (String s : queue) {
            if (s != null && s.length() < 4) {
                queueClean.add(s);
            }
        }
        return queueClean;
    }

}
