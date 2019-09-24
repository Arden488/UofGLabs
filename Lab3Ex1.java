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

    public static String scopeTest(String message) {
        message += " ";
        message += "is actually long";
        return message;
    }

    public static void main(String[] args) {
        double radius = 5.6;

        summariseCircle(radius);

        String message = "This string...";
        String newMessage = scopeTest(message);

        System.out.println(message);
        System.out.println(newMessage);
    }
}