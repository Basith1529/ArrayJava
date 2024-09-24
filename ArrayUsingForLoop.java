package printhello;
 
import java.util.*;

public class ArrayUsingForLoop {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		
		int[] marks=new int[10];
		
		int a=9;
		
//		for(int i=0;i<=a;i++) {
			
		/*	marks[0]=7;
			marks[1]=8;
			marks[2]=9;
			marks[3]=10;
			marks[4]=23;
			marks[5]=56;
			marks[6]=67;
			marks[7]=78;
			marks[8]=89;
			marks[9]=90;
		}

		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);
		System.out.println(marks[6]);
		System.out.println(marks[7]);
		System.out.println(marks[8]);
		System.out.println(marks[9]);*/
		
		
		for(int i=0;i<=a;i++) {
			
			marks[i]=sc.nextInt();
			
		}
		for(int i=0;i<=a;i++) {
			
			System.out.println(marks[i]);
		}

	}

}
