package com.codegym;

public class Customer {
    private String name;

    private String apartmentNumber;

    private int kwh;

    public Customer() {
    }

    public Customer(String name, String apartmentNumber, int kwh) {
        this.name = name;
        this.apartmentNumber = apartmentNumber;
        this.kwh = kwh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    @Override
    public String toString() {
        return name + ", " + apartmentNumber + ", " + kwh;
    }
}
