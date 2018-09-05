package com.brijesh.assignment.one;

/**
 * @author Brijesh
 *
 */
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {
	
	public String findLargestNumber(List<Integer> inputList) {
		int maxLen = Collections.max(inputList).toString().length();

		List<ElementDetail> numList = new ArrayList<ElementDetail>();
		for (int numVal: inputList)
			numList.add(new ElementDetail(numVal, maxLen));
		
		Collections.sort(numList, (obj1, obj2) -> (int) (obj2.modifiedValue - obj1.modifiedValue));
		
		StringBuilder sb = new StringBuilder();
		for (ElementDetail elementDetail: numList)
			sb.append(new StringBuilder(Long.toString(elementDetail.originalValue)));
		
		BigInteger bi = new BigInteger(sb.toString());
		return bi.toString();
	}

}