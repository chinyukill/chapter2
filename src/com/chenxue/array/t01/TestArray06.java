package com.chenxue.array.t01;

public class TestArray06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a= {{1,2,3},{3,4,5},{5,6,7}};
		printarray(a);
		
	}
	public static void printarray(int[][] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
