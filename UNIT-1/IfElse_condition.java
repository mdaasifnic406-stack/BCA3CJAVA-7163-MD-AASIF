//7_2 WRITE A JAVA PROGRAM USING IF ELSE CONDITION?

import java.util.Scanner;

 public class IfElse_condition{
 
		public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("enter your age: ");
		int age = scn.nextInt();
		
		if (age>18){
		  System.out.println("you are eligible to vote");
		}
		else{
		  System.out.println("you are not eligible to vote");
		}
		}
 
 }