package printhello;
import java.util.*;
public class ArrayAndForLoop {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		
		int[] marks=new int[5];
		
		//Forward integer number
		int a=4;
		
		for(int i=0;i<=a;i++) {
			
			marks[i]=sc.nextInt();
		}
		System.out.println("Forward the normal number");
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);

		
//--------------------------------------------------------------------------------------------------------------------
		//Reverse integer number
		
		System.out.println("Enter the number");
           int b=0;
		
		for(int i=4;i>=b;i--) {
			
			marks[i]=sc.nextInt();
		}
		System.out.println("Reverse the number");
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
//---------------------------------------------------------------------------------------------------------------------
		
		//one line print value
		System.out.println("Enter the number 2");
         int c=4;
		
		for(int i=0;i<=c;i++) {
			
			marks[i]=sc.nextInt();
		
		}
		   System.out.println("Forward");
           for(int i=0;i<=c;i++) {
			
			System.out.println(marks[i]);
		
		}
//------------------------------------------------------------------------------------------------------------------------
           
           //one line print value Reverse number
           System.out.println("Enter the reverse number 2");
           
           int d =4;
           
           for(int i=0;i<=d;i++) {
        	   
        	   marks[i]=sc.nextInt();
           }
           
           System.out.println("Reverse");
           for(int i=4;i>=0;i--) {
        	   
        	   System.out.println(marks[i]);
           }
           
		

	}

}


