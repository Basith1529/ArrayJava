package program;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Largest Number in Array
		int[] arr= {12,45,78,34,90};
		
		int largest=arr[0];
		
		for(int num:arr) {
			
			if(num > largest) {
				
				largest=num;
			}
		}
        System.out.println("Largest Number in Array: " +largest);
        
        
        //Smallest number in Array
        
        int smallest=arr[0];
        
        for(int Num:arr) {
        	
        	if(Num < smallest) {
        		
        		smallest=Num;
        	}
        	
     }
        System.out.println("Smallest Number in Array: " +smallest);
	}

}
