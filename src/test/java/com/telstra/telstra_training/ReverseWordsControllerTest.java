package com.telstra.telstra_training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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

import com.telstra.telstra_training.controller.ReverseWordsController;
import com.telstra.telstra_training.service.ReverseWordsService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ReverseWordsControllerTest {
	
	@Autowired
	public ReverseWordsController reverseWordsController;
	
	@Mock
	public ReverseWordsService reverseWordsService;
	
	@Test
	public void setUp() {
		reverseWordsController = new ReverseWordsController();
		reverseWordsService = new ReverseWordsService();
		ReflectionTestUtils.setField(reverseWordsController, "reverseWordsService", reverseWordsService);
	}
	@Test
    public void reverseWordsTest(){
      ResponseEntity<?> result =  reverseWordsController.reverseWords("suresh");
        assertEquals(result.getStatusCode(), HttpStatus.OK);
        assertNotNull(result);
    }
}
