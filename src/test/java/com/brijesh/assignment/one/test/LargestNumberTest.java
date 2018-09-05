
/**
 * @author Brijesh
 *
 */
package com.brijesh.assignment.one.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.brijesh.assignment.one.LargestNumber;
public class LargestNumberTest {

	@Test
	public void test_Arr1() {
		Integer arr[] = { 10, 2 };
		List<Integer> numList = Arrays.asList(arr);
		LargestNumber ln=new LargestNumber();
		String output=ln.findLargestNumber(numList);
		System.out.println("Expected: 210, Actual:"+output);
		Assert.assertEquals("210", output);
	}

	@Test
	public void test_Arr2() {
		Integer arr[] = { 3, 30, 34, 5, 9 };
		List<Integer> numList = Arrays.asList(arr);
		LargestNumber ln=new LargestNumber();
		String output=ln.findLargestNumber(numList);
		System.out.println("Expected: 9534330, Actual:"+output);
		Assert.assertEquals("9534330", output);
	}

}