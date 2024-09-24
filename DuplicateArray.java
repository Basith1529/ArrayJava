package program;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {1,2,3,4,5,1,2};
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]==num[i]) {
					
					System.out.println(num[i]);
					break;
				}
			}
		}

	}

}
