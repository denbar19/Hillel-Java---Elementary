package denisenko.homeTask20;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.*;

public class SQLiteCitiesService implements CitiesService {

    private static final Path root = Paths.get(".").normalize().toAbsolutePath();
    private static final String dbUrl = "jdbc:sqlite:" + root + "/" + "src/main/java/denisenko/homeTask20/homework.db;";
    // local dbUrl --> H:/download/Java/Hillel Java - Elementary/src/main/java/denisenko/homeTask20/homework.db;
    private static Connection connection = null;

    static {
        try {
            connection = DriverManager.getConnection(dbUrl);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static City newCity(String city) {
        return new City(UUID.randomUUID().toString(), city);
    }

    public void addCity(City city) throws SQLException {
        createTableIfNotExist();
        String querySet = "INSERT INTO cities VALUES ('" + city.getID() + "', '" + city.getNAME() + "');";
        try (Statement statement = connection.createStatement()) {
            statement.execute(querySet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTableIfNotExist() throws SQLException {
        String sqlQueryNewTable = "CREATE TABLE IF NOT EXISTS cities (\n "
                + "id TEXT PRIMARY KEY,\n"
                + "name TEXT NOT NULL UNIQUE\n"
                + ");";

        try (Statement statement = connection.createStatement()) {
            statement.execute(sqlQueryNewTable);
        }
    }

    public List<City> getCities() throws SQLException {
        String queryGetID = "SELECT id, name FROM cities;";
        List<City> cityList = new LinkedList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(queryGetID);
        if (rs == null) {
            return cityList;
        }
        while (rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            City city = new City(id, name);
            cityList.add(city);
        }
        return cityList;
    }
}
