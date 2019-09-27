public class Lab6Ex2 {
    public static boolean isNumberPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        int max = 100;
        int counter = 1;

        do {
            counter++;
            if (isNumberPrime(counter)) {
                System.out.println(counter);
            }
        } while (counter < max);
    }
}