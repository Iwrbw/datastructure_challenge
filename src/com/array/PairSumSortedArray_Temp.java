package com.array;

public class PairSumSortedArray_Temp {

	public static void main(String[] arg){
		int[] array = {11, 15, 6, 8, 9, 10};
		
		int sum = 16;
		
		pairSum(array, sum);
		
	}
	
	public static void pairSum(int[] array, int sum){
		boolean[] booleanArray = new boolean[400];
		for (int i = 0; i < array.length; i++) {
			int element  = array[i];
			
			if (!booleanArray[element]) {
				booleanArray[sum-element] = true;
			}else{
				System.out.println("pair found of sum "+ sum +" is ("+element+", "+(sum-element)+")");
			}			
		}
		
		//System.out.println("pair is not found");
		
	}
}
