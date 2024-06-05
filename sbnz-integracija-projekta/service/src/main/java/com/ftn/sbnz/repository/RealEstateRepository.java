package com.ftn.sbnz.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ftn.sbnz.model.enums.CottageLocationType;
import com.ftn.sbnz.model.models.Apartment;
import com.ftn.sbnz.model.models.Cottage;
import com.ftn.sbnz.model.models.House;
import com.ftn.sbnz.model.models.RealEstate;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RealEstateRepository implements IRealEstateRepository{


    @Override
    public List<RealEstate> allRealEstates() {

        List<RealEstate> realEstates = new ArrayList<>();

        realEstates.add(new House("Suburb A", 300000, 2000, 3, 15, 2, 500, true));

        realEstates.add(new House("Suburb B", 250000, 1998, 2, 20, 1, 800, false));

        realEstates.add(new House("Suburb C", 400000, 2010, 3, 25, 3, 600, true));

        realEstates.add(new House("Suburb D", 280000, 2003, 2, 18, 2, 700, true));

        realEstates.add(new House("Suburb E", 320000, 2008, 3, 22, 2, 800, false));

        realEstates.add(new House("Suburb F", 350000, 2012, 3, 20, 2, 1000, true));

        realEstates.add(new House("Suburb G", 2700, 2005, 2, 17, 1, 600, true));
        realEstates.add(new House("Suburb H", 330000, 2015, 3, 21, 2, 700, false));
        realEstates.add(new House("Suburb I", 29000, 2007, 2, 19, 1, 800, true));
        realEstates.add(new House("Suburb J", 380000, 2018, 3, 23, 2, 900, false));
        realEstates.add(new House("Suburb K", 260000, 2004, 2, 16, 1, 1000, true));
        realEstates.add(new House("Suburb L", 31000, 2010, 3, 24, 2, 1100, false));
        realEstates.add(new House("Suburb M", 270000, 2006, 2, 18, 1, 1200, true));
        realEstates.add(new House("Suburb N", 3600, 2016, 3, 22, 2, 1300, false));
        realEstates.add(new House("Suburb O", 300000, 2008, 2, 20, 1, 1400, true));
        realEstates.add(new House("Suburb P", 34000, 2012, 3, 26, 2, 1500, false));
        realEstates.add(new House("Suburb Q", 280000, 2006, 2, 19, 1, 1600, true));
        realEstates.add(new House("Suburb R", 37000, 2017, 3, 23, 2, 1700, false));
        realEstates.add(new House("Suburb S", 25000, 2003, 2, 17, 1, 1800, true));
        realEstates.add(new House("Suburb T", 320000, 2011, 3, 25, 2, 1900, false));
        realEstates.add(new House("Suburb U", 29000, 2009, 2, 21, 1, 2000, true));
        realEstates.add(new House("Suburb V", 350000, 2013, 3, 27, 2, 2100, false));
        realEstates.add(new House("Suburb W", 27000, 2007, 2, 18, 1, 2200, true));
        realEstates.add(new House("Suburb X", 330000, 2015, 3, 26, 2, 2300, false));
        realEstates.add(new House("Suburb Y", 30000, 2008, 2, 22, 1, 2400, true));
        realEstates.add(new House("Suburb Z", 340000, 2014, 3, 28, 2, 2500, false));


        // Cottage
        realEstates.add(new Cottage("Rural Area B", 150000, 1985, 2, 1000, 2, CottageLocationType.NEAR_MOUNTAIN));

        realEstates.add(new Cottage("Village C", 180000, 1975, 1, 700, 1, CottageLocationType.NEAR_RIVER));

        realEstates.add(new Cottage("Mountain Area D", 220000, 2005, 2, 1200, 3, CottageLocationType.NEAR_MOUNTAIN));

        realEstates.add(new Cottage("Beachfront E", 350000, 2012, 3, 900, 2, CottageLocationType.NEAR_RIVER));

        realEstates.add(new Cottage("Lakefront F", 280000, 1995, 2, 600, 2, CottageLocationType.NEAR_SEA));

        realEstates.add(new Cottage("Forest Area G", 200000, 2000, 1, 1500, 3, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Mountain View H", 240000, 1998, 2, 800, 2, CottageLocationType.NEAR_MOUNTAIN));
        realEstates.add(new Cottage("River Valley I", 190000, 2003, 2, 1100, 2, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Sea Breeze J", 320000, 2010, 3, 1000, 2, CottageLocationType.NEAR_SEA));
        realEstates.add(new Cottage("Village Retreat K", 170000, 1990, 2, 850, 1, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Mountain Hideaway L", 210000, 1980, 1, 950, 2, CottageLocationType.NEAR_MOUNTAIN));
        realEstates.add(new Cottage("Beach House M", 380000, 2007, 3, 1200, 2, CottageLocationType.NEAR_SEA));
        realEstates.add(new Cottage("Lake House N", 260000, 1993, 2, 700, 2, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Forest Retreat O", 230000, 2002, 2, 1300, 3, CottageLocationType.NEAR_MOUNTAIN));
        realEstates.add(new Cottage("Mountain Retreat P", 250000, 2004, 2, 900, 2, CottageLocationType.NEAR_MOUNTAIN));
        realEstates.add(new Cottage("Riverfront Q", 200000, 1997, 2, 1000, 2, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Seaside Cottage R", 300000, 2009, 3, 800, 2, CottageLocationType.NEAR_SEA));
        realEstates.add(new Cottage("Village House S", 190000, 1988, 2, 750, 1, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Mountain Cabin T", 270000, 1996, 1, 850, 2, CottageLocationType.NEAR_MOUNTAIN));
        realEstates.add(new Cottage("Beachfront Villa U", 400000, 2015, 4, 1100, 2, CottageLocationType.NEAR_SEA));
        realEstates.add(new Cottage("Lakeside Retreat V", 290000, 2003, 3, 900, 2, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Forest Lodge W", 260000, 1999, 2, 1200, 3, CottageLocationType.NEAR_MOUNTAIN));
        realEstates.add(new Cottage("Mountain Chalet X", 280000, 2000, 2, 950, 2, CottageLocationType.NEAR_MOUNTAIN));
        realEstates.add(new Cottage("Riverfront Cabin Y", 210000, 1994, 1, 800, 1, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Seaside Bungalow Z", 320000, 2011, 2, 1000, 2, CottageLocationType.NEAR_SEA));
        realEstates.add(new Cottage("Hillside Cottage AA", 220000, 1995, 2, 900, 2, CottageLocationType.NEAR_MOUNTAIN));
        realEstates.add(new Cottage("Riverbank House BB", 190000, 1990, 3, 1200, 2, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Seaview Cottage CC", 350000, 2013, 2, 800, 1, CottageLocationType.NEAR_SEA));
        realEstates.add(new Cottage("Village Retreat DD", 180000, 1985, 2, 700, 1, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Mountain View EE", 240000, 1998, 2, 850, 2, CottageLocationType.NEAR_MOUNTAIN));
        realEstates.add(new Cottage("River Valley FF", 200000, 2003, 2, 1100, 2, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Sea Breeze GG", 320000, 2010, 3, 1000, 2, CottageLocationType.NEAR_SEA));
        realEstates.add(new Cottage("Village Retreat HH", 170000, 1990, 2, 850, 1, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Mountain Hideaway II", 210000, 1980, 1, 950, 2, CottageLocationType.NEAR_MOUNTAIN));
        realEstates.add(new Cottage("Beach House JJ", 380000, 2007, 3, 1200, 2, CottageLocationType.NEAR_SEA));
        realEstates.add(new Cottage("Lake House KK", 260000, 1993, 2, 700, 2, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Forest Retreat LL", 230000, 2002, 2, 1300, 3, CottageLocationType.NEAR_MOUNTAIN));
        realEstates.add(new Cottage("Mountain Retreat MM", 250000, 2004, 2, 900, 2, CottageLocationType.NEAR_MOUNTAIN));
        realEstates.add(new Cottage("Riverfront NN", 200000, 1997, 2, 1000, 2, CottageLocationType.NEAR_RIVER));
        realEstates.add(new Cottage("Seaside Cottage OO", 300000, 2009, 3, 800, 2, CottageLocationType.NEAR_SEA));
        realEstates.add(new Cottage("Village House PP", 190000, 1988, 2, 750, 1, CottageLocationType.NEAR_RIVER));


        // Apartment
        realEstates.add(new Apartment("City Center", 500000, 2015, 2, 5, 1, 0, 1, 43));

        realEstates.add(new Apartment("City Outskirts", 350000, 2020, 3, 2, 2, 10, 2, 100));

        realEstates.add(new Apartment("Downtown", 600000, 2018, 2, 10, 1, 1, 1, 75));

        realEstates.add(new Apartment("Riverside", 450000, 2016, 2, 3, 1, 5, 1, 200));

        realEstates.add(new Apartment("High-Rise", 700000, 2022, 3, 20, 2, 2, 2, 32));

        realEstates.add(new Apartment("Gated Community", 800000, 2019, 4, 5, 2, 8, 2, 90));
        realEstates.add(new Apartment("Suburbia", 400000, 2017, 2, 5, 1, 15, 1, 60));
        realEstates.add(new Apartment("Luxury Tower", 1500000, 2016, 4, 25, 2, 2, 3, 150));
        realEstates.add(new Apartment("Family Complex", 550000, 2014, 3, 8, 2, 12, 2, 110));
        realEstates.add(new Apartment("Student Dormitory", 200000, 2010, 1, 5, 1, 5, 1, 25));
        realEstates.add(new Apartment("Penthouse View", 1200000, 2019, 3, 30, 2, 3, 2, 100));
        realEstates.add(new Apartment("Modern Loft", 900000, 2015, 2, 15, 1, 3, 1, 80));
        realEstates.add(new Apartment("Green Oasis", 650000, 2013, 3, 10, 2, 10, 2, 95));
        realEstates.add(new Apartment("Art Deco Apartment", 750000, 2011, 2, 12, 1, 5, 1, 70));
        realEstates.add(new Apartment("Lakefront Luxury", 1000000, 2018, 4, 18, 2, 7, 2, 120));
        realEstates.add(new Apartment("Skyline Residence", 850000, 2016, 3, 20, 2, 5, 2, 90));
        realEstates.add(new Apartment("Cozy Studio", 300000, 2021, 1, 5, 0, 3, 0, 40));
        realEstates.add(new Apartment("Mountain View", 950000, 2017, 3, 12, 2, 15, 2, 100));
        realEstates.add(new Apartment("Rooftop Terrace", 1100000, 2014, 3, 25, 2, 4, 2, 130));
        realEstates.add(new Apartment("Industrial Loft", 800000, 2012, 2, 10, 1, 8, 1, 85));
        realEstates.add(new Apartment("Waterfront Haven", 1300000, 2019, 4, 22, 2, 6, 2, 140));
        realEstates.add(new Apartment("Garden Retreat", 600000, 2015, 3, 8, 2, 5, 1, 75));
        realEstates.add(new Apartment("City View Condo", 700000, 2016, 2, 15, 1, 2, 1, 65));
        realEstates.add(new Apartment("Quaint Residence", 400000, 2013, 2, 5, 1, 4, 1, 55));
        realEstates.add(new Apartment("Cosmopolitan Living", 900000, 2018, 3, 18, 2, 3, 2, 85));
        realEstates.add(new Apartment("Sunset Tower", 750000, 2017, 2, 12, 1, 6, 1, 70));
        realEstates.add(new Apartment("Urban Oasis", 850000, 2015, 3, 20, 2, 5, 2, 95));
        realEstates.add(new Apartment("Riverside Retreat", 950000, 2016, 3, 18, 2, 7, 2, 100));
        realEstates.add(new Apartment("Central Loft", 700000, 2019, 2, 15, 1, 2, 1, 65));
        realEstates.add(new Apartment("Parkside Living", 550000, 2014, 2, 10, 1, 5, 1, 60));
        realEstates.add(new Apartment("Luxury Penthouse", 1500000, 2016, 4, 30, 2, 3, 3, 150));
        realEstates.add(new Apartment("Cityscape View", 950000, 2017, 3, 25, 2, 5, 2, 100));
        realEstates.add(new Apartment("Harbor Heights", 1100000, 2015, 3, 20, 2, 4, 2, 120));
        realEstates.add(new Apartment("Sky High Luxury", 1300000, 2019, 4, 35, 2, 6, 2, 140));
        realEstates.add(new Apartment("Modern Chic", 800000, 2018, 2, 15, 1, 3, 1, 80));
       return  realEstates;

    }

    public List<House> getAllHouses() {
        List<RealEstate> allRealEstates = allRealEstates();
        List<House> houses = new ArrayList<>();

        for (RealEstate realEstate : allRealEstates) {
            if (realEstate instanceof House) {
                houses.add((House) realEstate);
            }
        }

        return houses;
    }
    public List<Cottage> getAllCottages() {
        List<RealEstate> allRealEstates = allRealEstates();
        List<Cottage> cottages = new ArrayList<>();

        for (RealEstate realEstate : allRealEstates) {
            if (realEstate instanceof Cottage) {
                cottages.add((Cottage) realEstate);
            }
        }

        return cottages;
    }


    public List<Apartment> getAllApartments() {
        List<RealEstate> allRealEstates = allRealEstates();
        List<Apartment> apartments = new ArrayList<>();

        for (RealEstate realEstate : allRealEstates) {
            if (realEstate instanceof Apartment) {
                apartments.add((Apartment) realEstate);
            }
        }

        return apartments;
    }
}
