package com.fiftyq;

import java.util.ArrayList;
import java.lang.Math;

public class GrayCode {

	// The jist of the problem is the comparison of two integers' binary values, if 
	// the binary values differ by more than one bit then we return a false, else retun a true
	
	public static Integer[] BinaryValue(int val) {
		
		ArrayList<Integer> binvalue = new ArrayList<>();
		
		while(val > 0) {
			int temp = val%2;
			binvalue.add(temp);
			val = val/2;
		}
		
		Integer[] arr  = new Integer[binvalue.size()];
		return binvalue.toArray(arr);
	}
	
	public static boolean GrayCode(int val1, int val2) {
		
		if (val1 < 0 || val2 < 0) return false;
		
		Integer[] binValue1 = GrayCode.BinaryValue(val1);
		Integer[] binValue2 = GrayCode.BinaryValue(val2);
		
		if(Math.abs(binValue1.length - binValue2.length) > 1) {
			return false;
		}
		
		int changeCount = 0;
		
		for(int i = 0; i < Math.max(binValue1.length, binValue2.length); i++) {
			if (i >= binValue1.length || i >= binValue2.length) break;
			if (binValue1[i] == binValue2[i]) {
				continue;
			} else {
				changeCount++;
				if(changeCount == 2) {
					return false;
				}
			}			
		}
		
		
		return true;
	}
	
	public static boolean Gray(int val1, int val2) {
		int x = val1 ^ val2;
		return (x & (x - 1))== 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The GrayCode of the two values of 1,2 is: " + GrayCode.GrayCode(1, 2));
		
		System.out.println("The GrayCode of the two values of 8,9 is: " + GrayCode.Gray(8, 9));
	}

}
