public class Lab7Ex1 {
    private static void outputResult(double num, int min, int max) {
        if (min >= max || min < 0 || max < 0) {
            System.out.println("Incorrect input");
            return;
        }

        for (int i = min; i <= max; i++) {
            double m = num * i;
            String result = String.format("%5f x %2d = %8f", num, i, m);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        outputResult(8.5678, 0, 99);
    }
}