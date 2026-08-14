//Find Smallest and Largest of Three Numbers

import java.util.Scanner;

public class SmallBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int smallest = a;
        int largest = a;

        if (b < smallest)
            smallest = b;

        if (c < smallest)
            smallest = c;

        if (b > largest)
            largest = b;

        if (c > largest)
            largest = c;

        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }
}