//Check Even or Odd (Print 1 if Even, 0 if Odd)

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}