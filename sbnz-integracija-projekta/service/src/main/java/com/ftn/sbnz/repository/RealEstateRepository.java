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



}
