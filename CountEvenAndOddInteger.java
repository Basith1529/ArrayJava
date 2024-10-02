package program;

public class CountEvenAndOddInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,11,12,23};
		
		int even=0;
		int odd=0;
		
		for(int array:arr) {
			
			if(array % 2==0) {
				
				even++;
			}
			else { 
				
				odd++;
			}
		}
		System.out.println("Even :" +even +", Odd: " +odd);	
			
	}

}
