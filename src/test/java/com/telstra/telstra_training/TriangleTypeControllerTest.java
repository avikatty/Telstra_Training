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
import com.telstra.telstra_training.controller.TriangleTypeController;
import com.telstra.telstra_training.service.TriangleTypeService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TriangleTypeControllerTest {

	@Autowired
	public TriangleTypeController triangleTypeController;
	
	@Mock
	public TriangleTypeService triangleTypeService;
	
	@Before
	public void setUp() {
		triangleTypeController = new TriangleTypeController();
		triangleTypeService = new TriangleTypeService();
		ReflectionTestUtils.setField(triangleTypeController, "triangleTypeService", triangleTypeService);
	}
	
	@Test
    public void fetchTriangleTypeTest(){
        ResponseEntity<?> result = triangleTypeController.fetchTriangleType(1,2,3);
        assertEquals(result.getStatusCode(), HttpStatus.OK);
        assertNotNull(result);
	}

}
