public class Lab7Ex1 {
    private static void outputResult(double num, int max) {
        for (int i = 0; i < max; i++) {
            double m = num * i;
            String result = String.format("%5f x %2d = %8f", num, i, m);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        outputResult(8.5678, 99);
    }
}