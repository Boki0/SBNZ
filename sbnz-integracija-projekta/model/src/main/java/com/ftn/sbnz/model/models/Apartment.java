package com.ftn.sbnz.model.models;

public class Apartment extends RealEstate{
    private int floorLevel;
    private int numOfParkingSpaces;
    private int distanceFromCityCenter;
    private int numOfTerraces;

    public Apartment(String location, int price, int yearBuilt, int numOfBathrooms, int floorLevel, int numOfParkingSpaces, int distanceFromCityCenter, int numOfTerraces, int area) {
        super(location, price, yearBuilt, numOfBathrooms);
        this.floorLevel = floorLevel;
        this.numOfParkingSpaces = numOfParkingSpaces;
        this.distanceFromCityCenter = distanceFromCityCenter;
        this.numOfTerraces = numOfTerraces;
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    private int area;




    public int getFloorLevel() {
        return floorLevel;
    }

    public void setFloorLevel(int floorLevel) {
        this.floorLevel = floorLevel;
    }

    public int getNumOfParkingSpaces() {
        return numOfParkingSpaces;
    }

    public void setNumOfParkingSpaces(int numOfParkingSpaces) {
        this.numOfParkingSpaces = numOfParkingSpaces;
    }

    public int getDistanceFromCityCenter() {
        return distanceFromCityCenter;
    }

    public void setDistanceFromCityCenter(int distanceFromCityCenter) {
        this.distanceFromCityCenter = distanceFromCityCenter;
    }

    public int getNumOfTerraces() {
        return numOfTerraces;
    }

    public void setNumOfTerraces(int numOfTerraces) {
        this.numOfTerraces = numOfTerraces;
    }
}
