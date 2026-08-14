//Swap Two Variables (With and Without Temp)

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // With temp
        int x = a;
        int y = b;
        int temp = x;
        x = y;
        y = temp;

        System.out.println("Using Temp:");
        System.out.println("a = " + x);
        System.out.println("b = " + y);

        // Without temp
        x = a;
        y = b;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Without Temp:");
        System.out.println("a = " + x);
        System.out.println("b = " + y);
    }
}