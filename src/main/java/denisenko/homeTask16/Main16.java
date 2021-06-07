package denisenko.homeTask16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.apache.commons.collections4.CollectionUtils.*;

/**
 * Скачать последнюю версию Maven, указать его в настройках IDEA (этот пункт я никак не проверю)
 * Создать пустой Maven-проект (без использования архетипов)
 * Добавить зависимость Apache Commons Collections 4.4
 * Показать примеры использования методов reverseArray и isEmpty (передать в метод null, пустую коллецию и не пустую) из класса
 * https://commons.apache.org/proper/commons-collections/apidocs/org/apache/commons/collections4/CollectionUtils.html
 * 5* Добавить плагин maven-compiler-plugin в секцию build - plugins.
 * Указать версию Java в настройках плагина вместо указывания в <properties>
 */
public class Main16 {

    public static void main(String[] ars) {

        Integer[] arr = {1, 2, 3};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(isEmpty(null));
        System.out.println(isEmpty(emptyCollection()));

        Collection<String> collection = new ArrayList<>(Arrays.asList("w", "w"));
        System.out.println(isEmpty(collection));
    }
}
