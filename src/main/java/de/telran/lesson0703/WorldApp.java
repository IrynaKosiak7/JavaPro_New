package de.telran.lesson0703;

import java.util.List;

public class WorldApp {
    public static void main(String[] args) {
        CityDAO cityDAO = new CityDAO();
        List<City> cities = cityDAO.getAll();

//        City city = cityDAO.getById(1);
//        System.out.println(city);
//
//        City newCity = new City(234152, "Dream City", "USA", " ", 1);
//        cityDAO.save(newCity);

//        cityDAO.saveSpecialCities();
//        cities.forEach(System.out::println);

//        cityDAO.delete(2);


        City cityToUpdate = new City();
        cityToUpdate.setId(1);
        cityToUpdate.setName("New York");
        cityToUpdate.setCountryCode("USA");
        cityToUpdate.setPopulation(8419000);

        cityDAO.update(cityToUpdate);
        cities = cityDAO.getAll();

        cities.forEach(System.out::println);

//        cities = cityDAO.findCitiesWithPopulationMoreThan(200000);

        cityDAO.printDetailedInfoById(20);
//        CountryDAO countryDAO = new CountryDAO();
//        List<Country> countries = countryDAO.getAll();

//        countries.forEach(System.out::println);
//       cityDAO.printDetailedInfoById(66);


    }
}
