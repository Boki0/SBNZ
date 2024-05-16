package com.ftn.sbnz.model.models;

import com.ftn.sbnz.model.enums.CottageLocationType;

public class Cottage extends RealEstate{
    private int sizeOfGarden;
    private int numOfParkingSpaces;
    private CottageLocationType locationType;

    public Cottage(String location, int price, int yearBuilt, int numOfBathrooms, int sizeOfGarden, int numOfParkingSpaces, CottageLocationType locationType) {
        super(location, price, yearBuilt, numOfBathrooms);
        this.sizeOfGarden = sizeOfGarden;
        this.numOfParkingSpaces = numOfParkingSpaces;
        this.locationType = locationType;
    }

    public int getSizeOfGarden() {
        return sizeOfGarden;
    }

    public void setSizeOfGarden(int sizeOfGarden) {
        this.sizeOfGarden = sizeOfGarden;
    }

    public int getNumOfParkingSpaces() {
        return numOfParkingSpaces;
    }

    public void setNumOfParkingSpaces(int numOfParkingSpaces) {
        this.numOfParkingSpaces = numOfParkingSpaces;
    }

    public CottageLocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(CottageLocationType locationType) {
        this.locationType = locationType;
    }

    @Override
    public String toString() {
        return "Cottage{" +
                "sizeOfGarden=" + sizeOfGarden +
                ", numOfParkingSpaces=" + numOfParkingSpaces +
                ", locationType=" + locationType +
                '}';
    }
}
