package com.ftn.sbnz.repository;

import com.ftn.sbnz.model.models.RealEstate;

import java.io.IOException;
import java.util.List;

public interface IRealEstateRepository {
    public List<RealEstate> allRealEstates() throws IOException;
}
