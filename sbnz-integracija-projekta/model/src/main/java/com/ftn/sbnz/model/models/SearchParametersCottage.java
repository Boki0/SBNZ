package com.ftn.sbnz.model.models;

import com.ftn.sbnz.model.enums.CottageLocationType;

public class SearchParametersCottage {
    private double maxPrice;
    private int minYearBuilt;
    private int minNumOfBathrooms;
    private int minSizeOfGarden;
    private int minNumOfParkingSpaces;
    private CottageLocationType locationType;

    public SearchParametersCottage(double maxPrice, int minYearBuilt, int minNumOfBathrooms, int minSizeOfGarden,
                                   int minNumOfParkingSpaces, String locationType) {
        this.maxPrice = maxPrice;
        this.minYearBuilt = minYearBuilt;
        this.minNumOfBathrooms = minNumOfBathrooms;
        this.minSizeOfGarden = minSizeOfGarden;
        this.minNumOfParkingSpaces = minNumOfParkingSpaces;
        this.locationType = CottageLocationType.valueOf(locationType);

            
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

    public int getMinSizeOfGarden() {
        return minSizeOfGarden;
    }

    public void setMinSizeOfGarden(int minSizeOfGarden) {
        this.minSizeOfGarden = minSizeOfGarden;
    }

    public int getMinNumOfParkingSpaces() {
        return minNumOfParkingSpaces;
    }

    public void setMinNumOfParkingSpaces(int minNumOfParkingSpaces) {
        this.minNumOfParkingSpaces = minNumOfParkingSpaces;
    }

    public CottageLocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(CottageLocationType locationType) {
        this.locationType = locationType;
    }
}



