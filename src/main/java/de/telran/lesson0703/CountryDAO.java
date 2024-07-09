package de.telran.lesson0703;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CountryDAO implements WorldDAO<Country, String>{
    private ConnectorDB connectorDB = new ConnectorDB();
    private static final String GET_ALL = "SELECT  * FROM country";
    private static final String GET_BY_CODE = "SELECT  * FROM country WHERE country.code = ?";


    @Override
    public Country getById(String code) {
        try (
                Connection connection = connectorDB.makeConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_CODE);
        ) {
            preparedStatement.setString(1, code);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Country country = getCountryFromResultSet(resultSet);
            return country;


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
@Override
    public List<Country> getAll() {
        List<Country> countries = new ArrayList<>();
        try (
                Connection connection = connectorDB.makeConnection();
                Statement statement = connection.createStatement();
        ) {
            ResultSet resultSet = statement.executeQuery(GET_ALL);
            while (resultSet.next()) {
                Country country = getCountryFromResultSet(resultSet);
                countries.add(country);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countries;

    }

    @Override
    public void save(Country country) {

    }

    @Override
    public void delete(String string) {

    }

    @Override
    public void update(Country country) {

    }

    public Country getCountryFromResultSet(ResultSet resultSet) throws SQLException {
        Country country = new Country("234152","Dream City", Continent.North_America,"USA", 1.5, 1, 1, 1.5, 36.5,2.5,"","","",2,"");
        country.setCode(resultSet.getString("Code"));
        country.setName(resultSet.getString("Name"));
        country.setContinent((Continent) resultSet.getObject("Continent"));
        country.setIndepYear(resultSet.getInt("IndepYear"));
        country.setRegion(resultSet.getString("Region"));
        country.setLocalName(resultSet.getString("localName"));
        country.setGovernmentForm(resultSet.getString("governmentForm"));
        country.setHeadOfState(resultSet.getString("headOfState"));
        country.setCapital(resultSet.getInt("capital"));
        country.setSurfaceArea(resultSet.getDouble("SurfaceArea"));
        country.setLifeExpectancy(resultSet.getDouble("lifeExpectancy"));
        country.setGNP(resultSet.getDouble("GNP"));
        country.setGNPOld(resultSet.getDouble("GNPOld"));
        country.setPopulation(resultSet.getInt("Population"));
        country.setCode2(resultSet.getString("Code2"));
        return country;


    }
}
