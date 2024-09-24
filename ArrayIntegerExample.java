package printhello;
import java.util.Scanner;
public class ArrayIntegerExample {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Array number");
		
		int[] score=new int[5];
		
		score[0]=sc.nextInt();
		score[1]=sc.nextInt();
		score[2]=sc.nextInt();
		score[3]=sc.nextInt();
		score[4]=sc.nextInt();
		
		System.out.println("Sum of the value");
		int sum=(score[0]+score[1]+score[2]+score[3]+score[4]);
		
		System.out.println("Total Score: "+sum);
		
		
//----------------------------------------------------------------------------------------------------------------------
		
		
		//Second method
//		int[] score1 = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),};
		
		
	}

}
