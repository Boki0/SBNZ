package com.ftn.sbnz.model.models;

public class SearchParametersHouse {
    private double maxPrice;
    private int minYearBuilt;
    private int minNumOfBathrooms;
    private int minFloors;
    private boolean hasGarden;

    // Default constructor
    public SearchParametersHouse() {
    }

    // Constructor with parameters
    public SearchParametersHouse(double maxPrice, int minYearBuilt, int minNumOfBathrooms, int minFloors, boolean hasGarden) {
        this.maxPrice = maxPrice;
        this.minYearBuilt = minYearBuilt;
        this.minNumOfBathrooms = minNumOfBathrooms;
        this.minFloors = minFloors;
        this.hasGarden = hasGarden;
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

    public int getMinFloors() {
        return minFloors;
    }

    public void setMinFloors(int minFloors) {
        this.minFloors = minFloors;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }
}
