package program;

import java.util.HashSet;

public class CommonElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,5,6,7,8,9,0};
		int[] arr1= {9,0,1,2,3,4};
		
		HashSet<Integer> set=new HashSet<>();
		
		System.out.println("Common Element: ");
		for(int array:arr) {
			
			set.add(array);
		}
		for(int array:arr1) {
			
			if(set.contains(array)) {
				
				System.out.println(array);
			}
			
		}
		
		

	}

}
