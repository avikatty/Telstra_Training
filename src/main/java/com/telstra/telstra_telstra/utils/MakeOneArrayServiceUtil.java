package com.telstra.telstra_training.utils;

import java.io.Serializable;
import java.util.List;

public class MakeOneArrayServiceUtil implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Integer> array;

	public List<Integer> getArray() {
		return array;
	}

	public void setArray(List<Integer> array) {
		this.array = array;
	}

}
