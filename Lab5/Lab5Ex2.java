import java.util.Scanner;

public class Lab5Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name and age with a space in between");
        String userNameAndAge = s.nextLine();
        Scanner o = new Scanner(userNameAndAge);
        String name = o.next();
        if (!o.hasNextInt()) {
            o.next();
        }
        int age = o.nextInt();
        System.out.println("Your name is " + name + " and your age is " + age);
    }
}