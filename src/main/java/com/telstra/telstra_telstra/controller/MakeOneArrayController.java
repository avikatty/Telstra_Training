package com.telstra.telstra_training.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.telstra.telstra_telstra.model.RestRequestModel;
import com.telstra.telstra_training.service.MakeOneArrayService;
import com.telstra.telstra_training.utils.MakeOneArrayServiceUtil;

@RestController
public class MakeOneArrayController {
	@Autowired
	private MakeOneArrayService makeOneArrayService;

	@PostMapping({ "/api/makeonearray" })
	public MakeOneArrayServiceUtil makeOneArray(@RequestBody RestRequestModel restRequest,
			HttpServletResponse response) {
		String headerValue = CacheControl.noCache().getHeaderValue();
		response.addHeader("Cache-Control", headerValue);
		response.addHeader("pragma", "no-cache");
		response.addHeader("expires", "-1");
		MakeOneArrayServiceUtil restResponse = new MakeOneArrayServiceUtil();
		restResponse.setArray(this.makeOneArrayService.makeOneArray(restRequest));
		return restResponse;
	}
}
