package com.telstra.telstra_telstra.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestRequestModel {
	@JsonProperty("Array1")
	public List<Integer> array1;
	@JsonProperty("Array2")
	public List<Integer> array2;
	@JsonProperty("Array3")
	public List<Integer> array3;
	@JsonProperty("Array4")
	public List<Integer> array4;
	@JsonProperty("Array5")
	public List<Integer> array5;
	@JsonProperty("Array6")
	public List<Integer> array6;
	@JsonProperty("Array7")
	public List<Integer> array7;
	@JsonProperty("Array8")
	public List<Integer> array8;
	@JsonProperty("Array9")
	public List<Integer> array9;
	@JsonProperty("Array10")
	public List<Integer> array10;

	public List<Integer> getArray1() {
		return this.array1;
	}

	public void setArray1(List<Integer> array1) {
		this.array1 = array1;
	}

	public List<Integer> getArray2() {
		return this.array2;
	}

	public void setArray2(List<Integer> array2) {
		this.array2 = array2;
	}

	public List<Integer> getArray3() {
		return this.array3;
	}

	public void setArray3(List<Integer> array3) {
		this.array3 = array3;
	}

	public List<Integer> getArray4() {
		return this.array4;
	}

	public void setArray4(List<Integer> array4) {
		this.array4 = array4;
	}

	public List<Integer> getArray5() {
		return this.array5;
	}

	public void setArray5(List<Integer> array5) {
		this.array5 = array5;
	}

	public List<Integer> getArray6() {
		return this.array6;
	}

	public void setArray6(List<Integer> array6) {
		this.array6 = array6;
	}

	public List<Integer> getArray7() {
		return this.array7;
	}

	public void setArray7(List<Integer> array7) {
		this.array7 = array7;
	}

	public List<Integer> getArray8() {
		return this.array8;
	}

	public void setArray8(List<Integer> array8) {
		this.array8 = array8;
	}

	public List<Integer> getArray9() {
		return this.array9;
	}

	public void setArray9(List<Integer> array9) {
		this.array9 = array9;
	}

	public List<Integer> getArray10() {
		return this.array10;
	}

	public void setArray10(List<Integer> array10) {
		this.array10 = array10;
	}
}
