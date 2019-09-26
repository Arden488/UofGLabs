import java.util.Scanner;

public class Lab5Ex3 {
    public static void outputHowManyWholeYearsOld(int date, int month, int year) {
        int wholeYears = compHowManyYearsOld(date, month, year);
        System.out.println("Input date: " + date + "/" + month + "/" + year + ". Whole years: " + wholeYears);
    }

    public static int compHowManyYearsOld(int date, int month, int year) {
        boolean notFullYear = false;
        int dateToday = 26;
        int monthToday = 9;
        int yearToday = 2019;

        if (monthToday < month || (monthToday == month && dateToday < date)) {
            notFullYear = true;
        }

        if (notFullYear) {
            yearToday--;
        }

        return yearToday - year;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a date separated by spaces");
        int date = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        outputHowManyWholeYearsOld(date, month, year);
    }
}