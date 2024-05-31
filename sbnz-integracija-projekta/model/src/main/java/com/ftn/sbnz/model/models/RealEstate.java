package com.ftn.sbnz.model.models;

public class RealEstate {
    private String location;
    private int price;
    private int yearBuilt;
    private int numOfBathrooms;

    public RealEstate(String location, int price, int yearBuilt, int numOfBathrooms) {
        this.location = location;
        this.price = price;
        this.yearBuilt = yearBuilt;
        this.numOfBathrooms = numOfBathrooms;
    }

    public RealEstate() {
    }

    public String getLocation() {
        return location;
    }

    public RealEstate setLocation(String location) {
        this.location = location;
        return null;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getNumOfBathrooms() {
        return numOfBathrooms;
    }

    public void setNumOfBathrooms(int numOfBathrooms) {
        this.numOfBathrooms = numOfBathrooms;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "location='" + location + '\'' +
                ", price=" + price +
                ", yearBuilt=" + yearBuilt +
                ", numOfBathrooms=" + numOfBathrooms +
                '}';
    }
}
