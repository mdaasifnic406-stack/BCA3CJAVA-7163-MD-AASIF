//Area and Perimeter of Rectangle and Circle
import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double rectArea = length * width;
        double rectPerimeter = 2 * (length + width);

        System.out.println("Rectangle Area = " + rectArea);
        System.out.println("Rectangle Perimeter = " + rectPerimeter);

        // Circle
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;

        System.out.println("Circle Area = " + circleArea);
        System.out.println("Circle Perimeter = " + circlePerimeter);
    }
}