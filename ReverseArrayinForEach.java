package task;

import java.util.Arrays;

public class ReverseArrayinForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr= {1,2,3,4,5,6};
//		reverseArray(arr);
//		
//		System.out.println("Reversed Array: ");
//		
//		for(int num:arr) {
//			
//			System.out.println(num+ " ");
//		}
//	}
//
//	public static void reverseArray(int[] arr) {
//		
//		int start=0;
//		int end=arr.length-1;
//		
//		for(start=0;start<end;start++) {
//			
//			int sum=arr[start];
//			arr[start]=arr[end];
//			arr[end]=sum;
//			
//			end--;
//		}
//		
		int[] arr= {1,2,3,4,5};
		
		System.out.println("Original Array: " +Arrays.toString(arr));
		
		reverseArray(arr);
		
		System.out.println("Reversed Array: " +Arrays.toString(arr));
	}
	
	public static void reverseArray(int[] arr) {
		
		int org=0;
		int rev=arr.length-1;
		
		for(org=0;org<rev;org++) {
			
			int temp=arr[org];
			arr[org]=arr[rev];
			arr[rev]=temp;
			
			rev--;
		}

	}
}
