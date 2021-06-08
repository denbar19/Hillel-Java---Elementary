package denisenko.homeTask20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 * https://www.sqlite.org/index.html - официальный сайт SQLite
 * https://www.sqlitetutorial.net/sqlite-tutorial - туториал для SQLite (как установить, как использовать)
 * Создать БД "homeworks.db"
 * Создать в ней таблицу "cities" с колонками id - TEXT (использовать класс java.util.UUID для заполнения этой колонки),
 * name - TEXT. Первчиный ключ - id. Имена городов не должны повторяться, добавить ограничение колонке.
 * Написать неизменяемый класс City с полями id и name.
 * Написать класс CitiesService с методами addCity(City) и getCities(), который возращает список городов.
 * В Main классе добавить несколько городов (можно сделать ввод названия города с клавиатуры),
 * вычитать их и напечатать в консоль.
 */
public class Main20 {

    public static void main(String[] args) throws SQLException, IOException {
        SQLiteCitiesService service = new SQLiteCitiesService();
        System.out.println("Enter the city you want to put in database");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String cityName = "";
        while (!cityName.equals("end")) {
            cityName = r.readLine();
            if (!cityName.isEmpty() && !cityName.equals("end")) {
                service.addCity(SQLiteCitiesService.newCity(cityName));
            }
        }
        service.getCities().forEach(System.out::println);
//        System.out.println(service.getCities());
    }

}
