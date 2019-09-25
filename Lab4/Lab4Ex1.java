public class Lab4Ex1 {
    public static boolean computeIfIsLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void outputIfAYearIsLeap(int year) {
        if (computeIfIsLeap(year)) {
            System.out.println("The year " + year + " is a leap year");
        } else {
            System.out.println("The year " + year + " is NOT a leap year");
        }
    }

    public static int compHowManyDays(String monthName, int year) {
        if (monthName == "Apr" || monthName == "Jun" || monthName == "Sep" || monthName == "Nov") {
            return 30;
        } else if (monthName == "Feb") {
            boolean isLeapYear = computeIfIsLeap(year);
            if (isLeapYear)
                return 28;
            else
                return 29;
        } else {
            return 31;
        }
    }

    public static void outputHowManyWholeYearsOld(int date, int month, int year) {
        int wholeYears = compHowManyYearsOld(date, month, year);
        System.out.println("Input date: " + date + "/" + month + "/" + year + ". Whole years: " + wholeYears);
    }

    public static int compHowManyYearsOld(int date, int month, int year) {
        boolean notFullYear = false;
        int dateToday = 25;
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

    public static void outputHowManyDays(String monthName, int year) {
        int numOfDays = compHowManyDays(monthName, year);
        System.out.println("Total number of days in " + monthName + ", " + year + " is " + numOfDays);
    }

    public static void main(String[] args) {
        outputIfAYearIsLeap(2010);
        outputIfAYearIsLeap(2011);
        outputIfAYearIsLeap(2012);
        outputIfAYearIsLeap(2013);
        outputIfAYearIsLeap(2014);
        outputIfAYearIsLeap(2015);
        outputIfAYearIsLeap(2016);
        outputIfAYearIsLeap(2017);
        outputIfAYearIsLeap(2018);
        outputIfAYearIsLeap(2019);
        outputIfAYearIsLeap(2020);
        outputIfAYearIsLeap(2200);
        outputIfAYearIsLeap(2300);
        outputIfAYearIsLeap(2400);

        outputHowManyDays("Jan", 2012);
        outputHowManyDays("Feb", 2012);
        outputHowManyDays("Feb", 2013);
        outputHowManyDays("Mar", 2012);
        outputHowManyDays("Apr", 2012);
        outputHowManyDays("May", 2012);
        outputHowManyDays("Jun", 2012);
        outputHowManyDays("Jul", 2012);
        outputHowManyDays("Aug", 2012);
        outputHowManyDays("Sep", 2012);
        outputHowManyDays("Oct", 2012);
        outputHowManyDays("Nov", 2012);
        outputHowManyDays("Dec", 2012);

        outputHowManyWholeYearsOld(14, 4, 1988);
        outputHowManyWholeYearsOld(24, 11, 1977);
        outputHowManyWholeYearsOld(25, 9, 1954);
        outputHowManyWholeYearsOld(3, 2, 1949);
        outputHowManyWholeYearsOld(24, 7, 2007);
    }
}