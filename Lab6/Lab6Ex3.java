import java.util.Random;
import java.util.Scanner;

public class Lab6Ex3 {
    public static int generateRandomNum(int bound) {
        Random rand = new Random();
        int randomNum = rand.nextInt(bound);

        return randomNum;
    }

    public static Scanner initiateUserInput() {
        Scanner input = new Scanner(System.in);

        return input;
    }

    public static boolean checkIfIsTooHigh(int userNum, int targetNum) {
        if (targetNum < userNum)
            return true;

        return false;
    }

    public static String getResult(boolean correctAnswer, int randomNum) {
        if (correctAnswer) {
            return "Concgratulations! " + randomNum + " is a correct answer!";
        }

        return "I'm sorry, you've ran out of attempts! " + randomNum + " was a correct answer";
    }

    public static String getHintText(int guess, int randomNum) {
        boolean isTooHigh = checkIfIsTooHigh(guess, randomNum);
        String hint = "Too low. ";
        if (isTooHigh)
            hint = "Too high. ";

        return hint;
    }

    public static boolean checkIfIsInBound(int guess, int bound) {
        if (guess > bound) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int bound = 100;
        int randomNum = generateRandomNum(bound);

        boolean correctAnswer = false;
        int attemptsCounter = 10;

        while (!correctAnswer && attemptsCounter != 0) {
            Scanner s = initiateUserInput();
            System.out.println("Please enter a number between 0 and " + bound + ". Be careful, you have 10 attempts!");

            int guess = s.nextInt();

            if (checkIfIsInBound(guess, bound)) {
                attemptsCounter--;

                if (guess == randomNum) {
                    correctAnswer = true;
                } else {
                    String hint = getHintText(guess, randomNum);
                    System.out.println(hint + "Guess again. " + attemptsCounter + " attempts left");
                }
            } else {
                System.out.println("You should guess a number between 0 and " + bound);
            }
        }

        String result = getResult(correctAnswer, randomNum);
        System.out.println(result);
    }
}