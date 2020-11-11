package com.fiftyq;

public class AllArrays {

	public static void ChangeRowsAndColumns(boolean[][] arr) {
		if(null == arr || arr.length == 0)
			return;
		
		//First figure out if the first row and first columns have a true in them, 
		///if yes set two boolean variables to make them all true
		boolean firstRow = false;
		boolean firstCol = false;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr[0].length; j++) {
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i][0]){
				firstCol = true;
				break;
			}
		}
		for(int i = 0; i < arr[0].length; i++) {
			if(arr[0][i]){
				firstRow = true;
				break;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr[0].length; j++) {
				if(arr[i][j]) {
					arr[0][j] = true;
					arr[i][0] = true;
				}
			}
		}
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i][0]) {
				for(int j = 1; j< arr[0].length; j++) {
					arr[i][j] = true;
				}
			}
		}
		for(int i = 1; i < arr.length; i++) {
			if(arr[0][i]) {
				for(int j = 1; j< arr[0].length; j++) {
					arr[j][i] = true;
				}
			}
		}
		
		if(firstRow) {
			for(int i = 0; i < arr.length; i++) {
				arr[0][i] = true;
			}
		}
		if(firstCol) {
			for(int i = 0; i < arr[0].length; i++) {
				arr[i][0] = true;
			}
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr[0].length; j++) {
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] arr = {
							{false, false, false, false},
							{false, false, false, true},
							{false, false, false, false},
							{false, false, false, false}
						   };
		
		AllArrays.ChangeRowsAndColumns(arr);
		
	}

}
