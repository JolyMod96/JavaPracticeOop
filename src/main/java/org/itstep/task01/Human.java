package org.itstep.task01;

import java.util.Date;

public class Human {
    // Fields
    private String fullName;
    private String dateOfBirth;
    private String phone;
    private String city;
    private String country;
    private String address;

    // Constructors
    public Human()
    {
        this(new String(), new String(), new String(), new String(), new String(), new String());
    }

    public Human(String fullName, String dateOfBirth, String phone, String city, String country, String address)
    {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    // Methods
    public String getFullName()
    {
        return this.fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public String getDateOfBirth()
    {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone()
    {
        return this.phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getCity()
    {
        return this.city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCountry()
    {
        return this.country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
