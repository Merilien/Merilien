import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a range! (ex. 0 100)");
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();
        System.out.println("How many lives do you want?");
        int lives = scanner.nextInt();
        startGame(lower, upper, lives, scanner);
    }

    public static void startGame(int lowerBound, int upperBound, int lives, Scanner scanner) {
        Random random = new Random();
        boolean correct = false;
        int number = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        System.out.println(String.format("I've the number between %d-%d. You have %d lives.", lowerBound, upperBound, lives));
        while (lives > 0 && correct == false) {
            int guess = scanner.nextInt();
            if (guess == number) {
                correct = true;
                System.out.println("Congratulations. You won!");
            } else {
                lives--;
                if (guess < number) {
                    System.out.println(String.format("Too low. You have %d lives left.", lives));
                } else {
                    System.out.println(String.format("Too high. You have %d lives left.", lives));
                }
            }
        }
    }
}
