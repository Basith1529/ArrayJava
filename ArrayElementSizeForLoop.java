package printhello;
import java.util.*;
public class ArrayElementSizeForLoop {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size");
		
		int size=sc.nextInt();
		int[] marks=new int[size];
		
		for(int i=0;i<=size-1;i++) {
			
			marks[i]=sc.nextInt();
		}
		
		System.out.println("Middle Number");
		System.out.println(marks[2]);
		

	}

}
