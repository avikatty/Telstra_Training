package com.telstra.telstra_training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;


import com.telstra.telstra_training.controller.FibonacciController;
import com.telstra.telstra_training.service.FibonacciService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class FibonacciControllerTest {
	
	@Autowired
	public FibonacciController fibonacciController;
	
	@Mock
	public FibonacciService fibonacciService;
	
	@Before
	public void setUp() {
		fibonacciController = new FibonacciController();
		fibonacciService = new FibonacciService();
		ReflectionTestUtils.setField(fibonacciController,"fibonacciService",fibonacciService);
	}
	
	@Test
    public void getNthFibonacciNumberTest(){
       ResponseEntity<?> result =  fibonacciController.getNthFibonacciNumber(5);
        assertEquals(result.getStatusCode(), HttpStatus.OK);
        assertNotNull(result);
    }
}
