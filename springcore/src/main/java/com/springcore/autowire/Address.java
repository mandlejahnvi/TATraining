package com.springcore.autowire;

public class Address {
    private String streetname;
    private String city;

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String streetname, String city) {
        this.streetname = streetname;
        this.city = city;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetname='" + streetname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
