package de.telran.lesson0703;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CityDAO implements WorldDAO<City, Integer> {
    private ConnectorDB connectorDB = new ConnectorDB();
    private static final String GET_ALL = "SELECT  * FROM CITY";
    private static final String GET_BY_ID = "SELECT  * FROM CITY WHERE city.id = ?";
    private static final String SAVE_CITY = "INSERT INTO city (city.name, city.population, city.country_code) VALUES(?, ?, ?)";
    private static final String UPDATE = "UPDATE city SET city.name = ?, city.population = ?, city.countryCode = ? WHERE city.id = ? ";
    private static final String DELETE_BY_ID = "Delete from city WHERE city.id=?";
    private static final String GET_Cities_With_Population_More_Than = "SELECT  * FROM CITY WHERE city.population > ?";
    private static final String PRINT_DETAILED_INFO_BY_ID = "SELECT city.ID, \n" +
            "city.Name, \n" +
            "city.CountryCode, \n" +
            "city.District,\n" +
            "city.Population,\n" +
            "country.Name, \n" +
            "country.Continent\n" +
            "FROM world.city\n" +
            "INNER JOIN country ON country.Code=city.CountryCode\n" +
            "where city.id = ?";

    @Override
    public List<City> getAll() {
        List<City> cities = new ArrayList<>();
        try (
                Connection connection = connectorDB.makeConnection();
                Statement statement = connection.createStatement();
        ) {
            ResultSet resultSet = statement.executeQuery(GET_ALL);
            while (resultSet.next()) {
                City city = getCityFromResultSet(resultSet);
                cities.add(city);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cities;
    }

    private City getCityFromResultSet(ResultSet resultSet) throws SQLException {
        City city = new City();
        city.setId(resultSet.getInt("ID"));
        city.setName(resultSet.getString("Name"));
        city.setCountryCode(resultSet.getString("CountryCode"));
        city.setPopulation(resultSet.getInt("Population"));
        return city;


    }

    @Override
    public City getById(Integer id) {
        try (
                Connection connection = connectorDB.makeConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID);
        ) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            City city = getCityFromResultSet(resultSet);
            return city;


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void save(City city) {
        try (
                Connection connection = connectorDB.makeConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SAVE_CITY);
        ) {
            preparedStatement.setString(1, city.getName());
            preparedStatement.setInt(2, city.getPopulation());
            preparedStatement.setString(3, city.getCountryCode());
            int updated = preparedStatement.executeUpdate();
            System.out.println("Update successfully: " + updated);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void saveSpecialCities() {
        try (
                Connection connection = connectorDB.makeConnection();
                Statement statement = connection.createStatement();
        ) {
            connection.setAutoCommit(false);
            statement.execute("INSERT INTO city (city.name, city.population, city.countrycode) VALUES('specialCity1', 200, 'USA')");
            Savepoint savepoint = connection.setSavepoint();

            statement.execute("INSERT INTO city (city.name, city.population, city.countrycode) VALUES('specialCity2', 1500, 'USA')");
            try {
                System.out.println(1 / 0);
            } catch (ArithmeticException e) {
                connection.rollback(savepoint);
            }

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        try (
                Connection connection = connectorDB.makeConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID);
        ) {
            preparedStatement.setInt(1, id);
            int delete = preparedStatement.executeUpdate();
            System.out.println("Delete successfully: " + delete);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(City city) {
        try (
                Connection connection = connectorDB.makeConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
        ) {

            preparedStatement.setString(1, city.getName());
            preparedStatement.setInt(2, city.getPopulation());
            preparedStatement.setString(3, city.getCountryCode());
            preparedStatement.setInt(4, city.getId());
            int updated = preparedStatement.executeUpdate();
            System.out.println("Update successfully: " + updated);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List findCitiesWithPopulationMoreThan(Integer population) {
        List<City> cities = new ArrayList<>();
        try (
                Connection connection = connectorDB.makeConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(GET_Cities_With_Population_More_Than);
        ) {
            preparedStatement.setInt(1, population);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                City city = getCityFromResultSet(resultSet);
                cities.add(city);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cities;
    }

    public void printDetailedInfoById(Integer id) {
        try (
                Connection connection = connectorDB.makeConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(PRINT_DETAILED_INFO_BY_ID);
        ) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                City city = getCityFromResultSet(resultSet);
                Country country = new Country();
                country.setName(resultSet.getString("Name"));

                country.setContinent(Continent.valueOf(resultSet.getString("Continent")));
                System.out.println("City: " + city + " from :" + country);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
