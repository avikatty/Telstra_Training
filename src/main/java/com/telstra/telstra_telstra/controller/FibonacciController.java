package com.telstra.telstra_training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telstra.telstra_training.service.FibonacciService;

@RestController
@RequestMapping("/api")
public class FibonacciController {

	@Autowired
	private FibonacciService fibonacciService;

	@RequestMapping(value = "/Fibonacci", method = RequestMethod.GET)
	public ResponseEntity<?> getNthFibonacciNumber(@RequestParam("n") Object nthFibNum)
			throws NumberFormatException {
		try {

			int object = Integer.parseInt(nthFibNum.toString());
			return ResponseEntity.status(HttpStatus.OK).cacheControl(CacheControl.noCache())
					.header("Pragma", "no-cache").body(fibonacciService.getNthFibonacciNumber(object));
		} catch (NumberFormatException numberFormatException) {
			throw new NumberFormatException("Invalid Input");
		}

	}
}
