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

        // Apartment
        realEstates.add(new Apartment("City Center", 500000, 2015, 2, 5, 1, 0, 1, 0));

        realEstates.add(new Apartment("City Outskirts", 350000, 2020, 3, 2, 2, 10, 2, 100));

        realEstates.add(new Apartment("Downtown", 600000, 2018, 2, 10, 1, 1, 1, 0));

        realEstates.add(new Apartment("Riverside", 450000, 2016, 2, 3, 1, 5, 1, 0));

        realEstates.add(new Apartment("High-Rise", 700000, 2022, 3, 20, 2, 2, 2, 0));

        realEstates.add(new Apartment("Gated Community", 800000, 2019, 4, 5, 2, 8, 2, 0));

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


}
