package com.telstra.telstra_training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telstra.telstra_training.service.TriangleTypeService;

@RestController
@RequestMapping("/api")
public class TriangleTypeController {

	@Autowired
	private TriangleTypeService triangleTypeService;

	@RequestMapping(value = "/TriangleType", method = RequestMethod.GET)
	public ResponseEntity<?> fetchTriangleType(@RequestParam("a") Object sideLength1,
			@RequestParam("b") Object sideLength2, @RequestParam("c") Object sideLength3) throws IllegalArgumentException{
		
		try {
			int varOne = Integer.parseInt(sideLength1.toString());
			int varTwo = Integer.parseInt(sideLength2.toString());
			int varThree = Integer.parseInt(sideLength3.toString());
			return ResponseEntity.status(HttpStatus.OK).cacheControl(CacheControl.noCache()).header("Pragma", "no-cache")
					.body(triangleTypeService.getTriangleType(varOne, varTwo, varThree));
		} catch (NumberFormatException numberFormatException) {
			throw new NumberFormatException("Invalid Input");
		}
		
	}

}
