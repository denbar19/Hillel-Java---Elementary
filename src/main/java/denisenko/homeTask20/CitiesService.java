package denisenko.homeTask20;

import java.sql.SQLException;
import java.util.List;

public interface CitiesService {

    void addCity(City city) throws SQLException;

    List<City> getCities() throws SQLException;

}
