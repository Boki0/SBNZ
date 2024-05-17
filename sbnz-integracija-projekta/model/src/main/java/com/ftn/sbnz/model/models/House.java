package com.ftn.sbnz.model.models;

public class House extends RealEstate{
    private int distanceFromCityCenter;
    private int floors;
    private int sizeOfGarden;

    private boolean hasGarage;


    public House(String location, int price, int yearBuilt, int numOfBathrooms, int distanceFromCityCenter, int floors, int sizeOfGarden, boolean hasGarage) {
        super(location, price, yearBuilt, numOfBathrooms);
        this.distanceFromCityCenter = distanceFromCityCenter;
        this.floors = floors;
        this.sizeOfGarden = sizeOfGarden;
        this.hasGarage = hasGarage;
    }

    public House() {
    }

    public int getDistanceFromCityCenter() {
        return distanceFromCityCenter;
    }

    public void setDistanceFromCityCenter(int distanceFromCityCenter) {
        this.distanceFromCityCenter = distanceFromCityCenter;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getSizeOfGarden() {
        return sizeOfGarden;
    }

    public void setSizeOfGarden(int sizeOfGarden) {
        this.sizeOfGarden = sizeOfGarden;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString() {
        return "House{" +
                "distanceFromCityCenter=" + distanceFromCityCenter +
                ", floors=" + floors +
                ", sizeOfGarden=" + sizeOfGarden +
                ", hasGarage=" + hasGarage +
                '}';
    }
}
