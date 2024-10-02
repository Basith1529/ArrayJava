package task;

import java.util.*;

public class Task1ReverseanArray {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.out.println("Enter the number");
    	int rev[]=new int[5];
		
    	int a=4;
    	
    	for(int i=0;i<=a;i++) {
    		
    		rev[i]=sc.nextInt();
    	}
    	System.out.println("Reverse");
    	
    	
    	for(int i=a;i>=0;i--) {
    		
    		System.out.println(rev[i]);
    	}
	
	}

}
