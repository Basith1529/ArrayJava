package task;

//The reverseArray method swaps elements starting from the ends of the array,
//moving toward the middle until all elements have been reversed.
//Arrays.toString(array) is used to print the array in a readable format.
import java.util.Arrays;

public class Task1ArrayRevInteger {
   public static void main(String[] args) {
        // Example array of integers
        int[] arr = {9, 1, 5, 9, 9, 1,6,4,3,7};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Call the method to reverse the array
        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    // Method to reverse the array
   public static void reverseArray(int[] arr) {
          int start = 0;
        int end = arr.length - 1;

//         Swap elements from start to end
//        while (start < end) {
//            int temp = array[start];
//            array[start] = array[end];
//            array[end] = temp;
//
//            // Move towards middle
//            start++;
//            end--;
//        }
        
//        for(start=0;start<end;start++) {
//        	
//        	int temp=array[start];
//        	array[start]=array[end];
//        	array[end]=temp;
        	
//        	start++;
  //      	end--;
    //    }
        
        do {
        	
        	int temp=arr[start];
        	arr[start]=arr[end];
        	arr[end]=temp;
        	
        	start++;
        	end--;
       }while(start<end);
     
        
    }
}
