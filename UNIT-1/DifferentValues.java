// program no.5
// Write a java program to get different values from user at runtime using Scanner. 

import java.util.Scanner;

class DifferentValues
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();

        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();

        System.out.print("Enter Gender : ");
        char gender = sc.next().charAt(0);

        System.out.println("\n-----User Information-----");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Gender : " + gender);
    }
}