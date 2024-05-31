package com.ftn.sbnz.service;

import DTO.LoginFormDTO;
import com.ftn.sbnz.model.models.House;
import com.ftn.sbnz.model.models.RealEstate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class SampleAppController {
	private static Logger log = LoggerFactory.getLogger(SampleAppController.class);

	private final SampleAppService sampleService;

	@Autowired
	public SampleAppController(SampleAppService sampleService) {
		this.sampleService = sampleService;
	}

	@CrossOrigin
	@PostMapping("/search")
	public List<RealEstate> searchProperties(
			@RequestParam double price,
			@RequestParam double maxPrice,
			@RequestParam String city,
			@DefaultValue("false") @RequestParam boolean nearBeach,
			@DefaultValue("false") @RequestParam boolean nearSea,
			@DefaultValue("false") @RequestParam boolean nearLake,
			@RequestParam int minRooms,
			@RequestParam int minArea
	) {
		// Ispis parametara u konzolu
		System.out.println("Received search criteria:");
		System.out.println("Price: " + price);
		System.out.println("Max Price: " + maxPrice);
		System.out.println("City: " + city);
		System.out.println("Near Beach: " + nearBeach);
		System.out.println("Near Sea: " + nearSea);
		System.out.println("Near Lake: " + nearLake);
		System.out.println("Min Rooms: " + minRooms);
		System.out.println("Min Area: " + minArea);

		List<RealEstate> properties = new ArrayList<>();
		RealEstate e = new RealEstate("novi sad",32,2002,3);
		RealEstate e1 = new RealEstate("beograd",33332,2022,32);
		RealEstate e2 = new RealEstate("zlatibor",323,3002,0);
		RealEstate k = new House("kamenica",40000,2001,3,30,3,4000,true);
		properties.add(e);
		properties.add(e1);
		properties.add(e2);
		properties.add(k);


		return properties;
	}
	public static class SearchCriteria {
		private double price;
		private double maxPrice;
		private String city;
		private boolean nearBeach;
		private boolean nearSea;
		private boolean nearLake;
		private int minRooms;
		private int minArea;

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public double getMaxPrice() {
			return maxPrice;
		}

		public void setMaxPrice(double maxPrice) {
			this.maxPrice = maxPrice;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public boolean isNearBeach() {
			return nearBeach;
		}

		public void setNearBeach(boolean nearBeach) {
			this.nearBeach = nearBeach;
		}

		public boolean isNearSea() {
			return nearSea;
		}

		public void setNearSea(boolean nearSea) {
			this.nearSea = nearSea;
		}

		public boolean isNearLake() {
			return nearLake;
		}

		public void setNearLake(boolean nearLake) {
			this.nearLake = nearLake;
		}

		public int getMinRooms() {
			return minRooms;
		}

		public void setMinRooms(int minRooms) {
			this.minRooms = minRooms;
		}

		public int getMinArea() {
			return minArea;
		}

		public void setMinArea(int minArea) {
			this.minArea = minArea;
		}

		// Getters and setters
	}

	@CrossOrigin
	@PostMapping("/login")
	public String login(@RequestBody LoginFormDTO form) {
		// Ovdje implementirajte logiku za provjeru korisničkih podataka i generiranje odgovora
		String message = "Welcome, " + form.getUsername() + "!";
		return message;
	}
	
	
	
}
