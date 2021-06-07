package denisenko.homeTask08.h08_1;

import java.util.*;

/**
 * Написать метод, который принимает на вход очередь строк и возвращает ее перевернутую версию.
 * Входную очередь изменять нельзя.
 */
public class QueueReverse {

    public Queue<String> revertQueue(Queue<String> queue) {
        Queue<String> q = new LinkedList<>(queue);
        Stack<String> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.add(q.peek());
            q.remove();
        }
        while (!stack.isEmpty()) {
            q.add(stack.peek());
            stack.pop();
        }
        return q;
    }
}
