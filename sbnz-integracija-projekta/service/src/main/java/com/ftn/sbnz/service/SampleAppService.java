package com.ftn.sbnz.service;

import com.ftn.sbnz.model.models.*;
import com.ftn.sbnz.repository.RealEstateRepository;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SampleAppService {

	private static Logger log = LoggerFactory.getLogger(SampleAppService.class);
	RealEstateRepository repository = new RealEstateRepository();

	private final KieContainer kieContainer;

	@Autowired
	public SampleAppService(KieContainer kieContainer) {
		log.info("Initialising a new example session.");
		this.kieContainer = kieContainer;
	}

	public List<House> getHouses(SearchParametersHouse searchParametersHouse) {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession ksession = kContainer.newKieSession("basicKsession");



		List<House> recommendations = new ArrayList<>();
		ksession.setGlobal("recommendations", recommendations);
		ksession.insert(searchParametersHouse);

		List<House> allHouses = repository.getAllHouses();

//// Kuće sa garažom
//		House house1 = new House("House with Garage 1", 2000, 1990, 3, 2, 1,30,true);
//		House house2 = new House("House with Garage 2", 2500, 2005, 2, 1, 2,543, true);
//		House house3 = new House("House with Garage 3", 180000, 2008, 2, 2, 1, 543,true);
//
//// Kuće bez garaže
//		House house4 = new House("House without Garage 1", 1500, 1985, 2, 1, 1,643, false);
//		House house5 = new House("House without Garage 2", 3000, 2010, 4, 2, 2,5436, false);
//		House house6 = new House("House without Garage 3", 220000, 2000, 3, 2, 1,867, false);
//
//		allHouses.add(house1);
//		allHouses.add(house2);
//		allHouses.add(house3);
//		allHouses.add(house4);
//		allHouses.add(house5);
//		allHouses.add(house6);

		for (House house : allHouses) {
			ksession.insert(house);
		}
		ksession.fireAllRules();
		System.out.println("Recommendations: " + recommendations);

		ksession.dispose();
		return recommendations;


	}

	public List<Cottage> getCottages(SearchParametersCottage searchPC) {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession ksession = kContainer.newKieSession("basicKsession");



		List<Cottage> recommendations = new ArrayList<>();
		ksession.setGlobal("recommendations", recommendations);
		ksession.insert(searchPC);

		List<Cottage> allCottages = repository.getAllCottages();


		for (Cottage cottage : allCottages) {
			ksession.insert(cottage);
		}
		ksession.fireAllRules();
		System.out.println("Recommendation cottages: " + recommendations);

		ksession.dispose();
		return recommendations;
	}


    public List<Apartment> searchApartments(SearchParametersApartment searchParams) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession ksession = kContainer.newKieSession("basicKsession");



		List<Apartment> recommendations = new ArrayList<>();
		ksession.setGlobal("recommendations", recommendations);
		ksession.insert(searchParams);

		List<Apartment> allApartments = repository.getAllApartments();


		for (Apartment apartment : allApartments) {
			ksession.insert(apartment);
		}
		ksession.fireAllRules();
		System.out.println("Recommendation apartments: " + recommendations);

		ksession.dispose();
		return recommendations;
    }


}
