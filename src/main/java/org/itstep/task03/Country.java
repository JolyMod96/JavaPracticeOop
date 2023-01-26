package org.itstep.task03;

import org.itstep.task02.City;

public class Country {
    private String name;
    private String continent;
    private String code;
    private City capital;
    private City[] cities;

    public Country() {
        this(new String(), new String(), new String(), new City());
    }

    public Country(String name, String continent, String code, City capital) {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
        this.cities = new City[0];
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return this.continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getInhabitants() {
        int citiesInhabitants = 0;
        for(City city:this.cities) {
            citiesInhabitants += city.getInhabitants();
        }
        return citiesInhabitants;
    }

    public City getCapital() {
        return this.capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public City[] getCities() {
        return this.cities;
    }

    public void addCity(City city) {
        int n = this.cities.length;
        City[] oldArr = this.cities;
        this.cities = new City[n + 1];
        for(int i = 0; i < n; i++) {
            this.cities[i] = oldArr[i];
        }
        this.cities[n] = city;
    }
}
