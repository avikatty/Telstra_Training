package telstra.assessment.work.service;

import org.springframework.stereotype.Service;

@Service
public class TriangleTypeService {
	
	public String getTriangleType(int sideLength1, int sideLength2, int sideLength3) {

		if (sideLength1 == sideLength2 && sideLength2 == sideLength3) {
			return "Equilateral";
		}
		else if (sideLength1 == sideLength2 || sideLength2 == sideLength3 || sideLength1 == sideLength3) {
			return "Isosceles";
		}
		else {
			return "Scalene";
		}
	}

}
