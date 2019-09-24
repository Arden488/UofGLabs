public class Lab3Ex1 {
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

    public static void scopeTest(String message) {
        message += " ";
        message += "is actually long";
        System.out.println(message);
    }

    public static void main(String[] args) {
        // First exercise
        double radius = 5.6;
        summariseCircle(radius);

        // Second exercise
        String message = "This string...";

        System.out.println(message);
        scopeTest(message);
    }
}