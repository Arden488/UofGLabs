public class Lab6Ex1 {
    public static void timesTable(int num, int max) {
        int counter = 1;

        do {
            System.out.println(num + " x " + counter + " = " + num * counter);
            counter++;
        } while (counter <= max);
    }

    public static void main(String[] args) {
        timesTable(3, 20);
    }
}