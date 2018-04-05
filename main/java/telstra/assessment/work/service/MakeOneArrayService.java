package telstra.assessment.work.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MakeOneArrayService {
	
	
	public Object[] makeOneArray(List integerArray) {
		
		
		List list = new ArrayList<Object>(Arrays.asList(integerArray.get(0)));
		for(int i=1;i<integerArray.size();i++) {
			list.addAll(Arrays.asList(integerArray.get(i)));
		}
		return list.toArray();
		
	}	
	

}
