// program no.3
// Write a java program to get personal information from user and display 
on screen. 

import java.util.Scanner;

class PersonalInfo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        System.out.print("Enter your course: ");
        String course = sc.nextLine();

        System.out.println("\nPersonal Information");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Course: " + course);
    }
}