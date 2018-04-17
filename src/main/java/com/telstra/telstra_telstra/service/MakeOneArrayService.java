package com.telstra.telstra_training.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.telstra.telstra_telstra.model.RestRequestModel;

@Service
public class MakeOneArrayService {
	private final Logger log = LoggerFactory.getLogger(getClass());
	List<Integer> array = new ArrayList<Integer>();

	public List<Integer> makeOneArray(RestRequestModel request) {
		List<Integer> mergedList = new ArrayList<Integer>();
		try {
			mergedList.addAll(request.getArray1());
			mergedList.addAll(request.getArray2());
			mergedList.addAll(request.getArray3());
			mergedList.addAll(request.getArray4());
			mergedList.addAll(request.getArray5());
			mergedList.addAll(request.getArray6());
			mergedList.addAll(request.getArray7());
			mergedList.addAll(request.getArray8());
			mergedList.addAll(request.getArray9());
			mergedList.addAll(request.getArray10());
			Arrays.sort(mergedList.toArray());
		} catch (Exception exceptionOccur) {
			this.log.error("Exception while getting the Arrays " + exceptionOccur.getMessage());
		}
		List<Integer> array = new ArrayList<Integer>();
		for (Integer value : mergedList) {
			if (!array.contains(value)) {
				array.add(value);
			}
		}
		return array;
	}
}
