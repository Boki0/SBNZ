package com.ftn.sbnz.model.models;

public class SearchParametersApartment {
    private double maxPrice;
    private int minYearBuilt;
    private int minNumOfBathrooms;
    private int minFloorLevel;
    private int minNumOfParkingSpaces;
    private int minDistanceFromCityCenter;
    private int minArea;

    public SearchParametersApartment(double maxPrice, int minYearBuilt, int minNumOfBathrooms, int minFloorLevel, int minNumOfParkingSpaces, int minDistanceFromCityCenter, int minArea) {
        this.maxPrice = maxPrice;
        this.minYearBuilt = minYearBuilt;
        this.minNumOfBathrooms = minNumOfBathrooms;
        this.minFloorLevel = minFloorLevel;
        this.minNumOfParkingSpaces = minNumOfParkingSpaces;
        this.minDistanceFromCityCenter = minDistanceFromCityCenter;
        this.minArea = minArea;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getMinYearBuilt() {
        return minYearBuilt;
    }

    public void setMinYearBuilt(int minYearBuilt) {
        this.minYearBuilt = minYearBuilt;
    }

    public int getMinNumOfBathrooms() {
        return minNumOfBathrooms;
    }

    public void setMinNumOfBathrooms(int minNumOfBathrooms) {
        this.minNumOfBathrooms = minNumOfBathrooms;
    }

    public int getMinFloorLevel() {
        return minFloorLevel;
    }

    public void setMinFloorLevel(int minFloorLevel) {
        this.minFloorLevel = minFloorLevel;
    }

    public int getMinNumOfParkingSpaces() {
        return minNumOfParkingSpaces;
    }

    public void setMinNumOfParkingSpaces(int minNumOfParkingSpaces) {
        this.minNumOfParkingSpaces = minNumOfParkingSpaces;
    }

    public int getMinDistanceFromCityCenter() {
        return minDistanceFromCityCenter;
    }

    public void setMinDistanceFromCityCenter(int minDistanceFromCityCenter) {
        this.minDistanceFromCityCenter = minDistanceFromCityCenter;
    }

    public int getMinArea() {
        return minArea;
    }

    public void setMinArea(int minArea) {
        this.minArea = minArea;
    }
}

