package denisenko.homeTask08.h08_3;

import java.util.*;

/**
 * 3. Написать метод, который принимает на вход список строк с дубликатами и возращает список из уникальных значений.
 * Напишите 2 его версии - с использованием Set и без.
 * Входящий список изменять нельзя.
 */
public class QueueUnique {

    public List<String> queueUniqueSet(List<String> queue) {
        Set<String> uniqQueue = new LinkedHashSet<>(queue);
        return new ArrayList<>(uniqQueue);
    }

    public List<String> queueUnique(List<String> queue) {
        List<String> uniqQueue = new LinkedList<>();
        for (String str : queue) {
            if (!uniqQueue.contains(str)) {
                uniqQueue.add(str);
            }
        }
        return uniqQueue;
    }

}