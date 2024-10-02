package program;

import java.util.Arrays;



public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse normal Array
		int[] arr= {1,2,3,4,5};
		
		System.out.println("Forward Integer: ");
		for(int i=0;i<=4;i++) {
			
			System.out.println(arr[i]);
		}

		System.out.println("Reversed Integer: ");
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.println(arr[i]);
		}
		
		//Reverse a toString Array
		int[] arr1= {7,3,4,6,1,9,9,5,1,9};
		
		System.out.println("Original Array: " +Arrays.toString(arr1));
		
		reverseArray(arr1);
		
		System.out.println("Reversed Array: " +Arrays.toString(arr1));
	}
		public static void reverseArray(int[] arr1) {
			int end=arr1.length-1;
			
			for(int start=0;start<end;start++) {
				
				int temp=arr1[start];
				arr1[start]=arr1[end];
				arr1[end]=temp;
				
				end--;
			}
			
			//while loop
			int[] arr2= {0,2,9,6,3,2,8,7,7,8};
			
			System.out.println("Original Array: " +Arrays.toString(arr2));
			
			reverseArray1(arr2);
			
			System.out.println("Reversed Array: " +Arrays.toString(arr2));
		}
			public static void reverseArray1(int[] arr2) {
			int right=0;
			int left=arr2.length-1;
			while(right < left) {
				
				int temp1=arr2[right];
				arr2[right]=arr2[left];
				arr2[left]=temp1;
				right++;
				left--;
			}
			
		}

	}
	


