package task;

import java.util.HashSet;

public class Task2FindCommonEle {
      
	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {5,6,7,8,9,10};
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int array:arr1) {
			
			set.add(array);
			
		}
			System.out.println("Common Elements: ");
			
			for(int array:arr2) {
				
				if(set.contains(array)) {
					
					System.out.println(array);
			}
		}
	}
	
}
