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
        int max = 12;
        int counter = 1;

        do {
            counter++;
            System.out.println("Prime status for " + counter + " is: " + isNumberPrime(counter));
        } while (counter < max);
    }
}