package com.hht.builder.domain;

public class Address {
    private String address;
    private String city;
    private String country;
    private String codigoPostal;

    public Address(){

    }

    public Address(String address, String city, String country, String codigoPostal) {
        this.address = address;
        this.city = city;
        this.country = country;
        this.codigoPostal = codigoPostal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                '}';
    }
}
