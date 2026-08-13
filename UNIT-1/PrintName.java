// program no.6
// Write a java program to get the name from user and print 10 times using loop.

import java.util.Scanner;

public class PrintName
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(name);
        }
    }
}