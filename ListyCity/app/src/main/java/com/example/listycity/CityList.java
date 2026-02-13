package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     *
     * @param city This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     *
     * @return Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns a whether cities has the given city
     *
     * @return Return whether cities has the given city
     */
    public boolean hasCity(City city) {
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).equals(city)) return true;
        }
        return false;
    }

    /**
     * This deletes the given city from cities.
     * It throws an exception if the city is not found.
     */
    public void delete(City city) {
        if (this.hasCity(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException("City not found");
        }
    }

    /**
     * This returns how many cities are in the list cities
     *
     * @return Return how many cities are in the list cities
     */
    public int countCities(){
        return cities.size();
    }
}