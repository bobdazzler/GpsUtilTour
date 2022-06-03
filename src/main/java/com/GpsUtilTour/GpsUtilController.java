package com.GpsUtilTour;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;

public class GpsUtilController {

	private GpsUtil gpsUtil;

	@Autowired
	public GpsUtilController(GpsUtil gpsUtil) {
		this.gpsUtil = gpsUtil;
	}

	/**
	 * 
	 * @return at a request this api returns a list of attractions
	 */
	@RequestMapping("attractions")
	public List<Attraction> getAttractions() {
		return gpsUtil.getAttractions();
	}

	/**
	 * 
	 * @param userId
	 * @return the user location
	 */
	@RequestMapping("/userLocation")
	public VisitedLocation getUserLocation(@RequestParam UUID userId) {
		return gpsUtil.getUserLocation(userId);
	}
}
