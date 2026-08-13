// program no. 7
// Write a java program to use IF Condition 

import java.util.Scanner;

public class IfExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println("You are eligible.");
        }
    }
}