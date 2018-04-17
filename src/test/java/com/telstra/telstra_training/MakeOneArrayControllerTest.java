package com.telstra.telstra_training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.servlet.http.HttpServletResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import com.telstra.telstra_telstra.model.RestRequestModel;
import com.telstra.telstra_training.controller.MakeOneArrayController;
import com.telstra.telstra_training.service.MakeOneArrayService;
import com.telstra.telstra_training.utils.MakeOneArrayServiceUtil;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MakeOneArrayControllerTest {

	@Mock
	public RestRequestModel restRequest;

	@Mock
	public HttpServletResponse response;

	@Autowired
	public MakeOneArrayController makeOneArrayController;

	@Mock
	public MakeOneArrayService makeOneArrayService;

	@Before
	public void setUp() {
		makeOneArrayController = new MakeOneArrayController();
		makeOneArrayService = new MakeOneArrayService();
		ReflectionTestUtils.setField(makeOneArrayController, "makeOneArrayService", makeOneArrayService);
	}

	@Test
	public void makeOneArray() {
		MakeOneArrayServiceUtil result = makeOneArrayController.makeOneArray(restRequest, response);
		assertEquals(result.getArray(), result.getArray());
		assertNotNull(result);
	}
}
