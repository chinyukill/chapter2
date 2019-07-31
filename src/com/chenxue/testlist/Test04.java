package com.chenxue.testlist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {-1,0,1,2,-1,-4};
		HashSet<ArrayList> hashSet = new HashSet<>();
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				for(int k=0;k<num.length;k++) {
					boolean flag=i!=j&&i!=k&&j!=k;
					
					if (flag) {
						int sum=num[i]+num[j]+num[k];
						
						if (sum==0) {
							ArrayList<Integer> arrayList = new ArrayList<>();
							arrayList.add(num[i]);
							arrayList.add(num[j]);
							arrayList.add(num[k]);
//							System.out.println(arrayList);
							Collections.sort(arrayList);
							hashSet.add(arrayList);
							
						}
					}
					
				}
			}
			
		}
		System.out.println(hashSet);
	}

}
