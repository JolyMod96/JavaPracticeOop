package org.itstep.task02;

public class City {
    private String name;
    private String region;
    private String country;
    private int inhabitants;
    private String index;
    private String code;

    public City() {
        this(new String(), new String(), new String(), 0, new String(), new String());
    }

    public City(String name, String region, String country, int inhabitants, String index, String code) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.inhabitants = inhabitants;
        this.index = index;
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getInhabitants() {
        return this.inhabitants;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    public String getIndex() {
        return this.index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
