import java.util.Scanner;

public class Lab5Ex1 {
    public static double compArea(double radius) {
        double pi = 3.145;

        return pi * radius * radius;
    }

    public static double compCircumference(double radius) {
        double pi = 3.145;

        return 2 * pi * radius;
    }

    public static void summariseCircle(double radius) {
        double area, circumference;

        area = compArea(radius);
        circumference = compCircumference(radius);

        System.out.println("Radius: " + radius + "\n" + "Area: " + area + "\n" + "Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter radius");
        double radius = keyboard.nextDouble();

        summariseCircle(radius);
    }
}