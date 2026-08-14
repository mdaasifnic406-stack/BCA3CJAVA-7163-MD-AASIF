//7_4 WRITE A JAVA PROGRAM USING NESTED IF?

import java.util.Scanner;

public class NESTED{
 
		public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("enter ypu age:");
		int age = scn.nextInt();
		
		boolean hasId = true;
		if(age>=18){
		 if(hasId ){
		     System.out.println("Access granted");
		 }
		 else{
		   System.out.println("dont granted");
		 }		 
		 }
		 else {
		   System.out.println("you are not eligible");
		 }
		 
				
		}
}