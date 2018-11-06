import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a range! (ex. 0 100)");
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();
        System.out.println("How many lives will you have?");
        int lives = scanner.nextInt();
        guessingGame(lower, upper, lives, scanner);
    }
    public static void guessingGame(int lower, int upper, int lives, Scanner scanner){
        Random rand = new Random();
        boolean correct = false;
        int number = rand.nextInt(upper-lower+1) + lower;
        System.out.println("I've the number between " + lower + "-" +upper + ". You have " + lives + " lives.");
        while (lives>0 && correct == false){
            int guess = scanner.nextInt();
            if (guess == number){
                correct = true;
                System.out.println("Congratulations. You won!");
            }
            else{
                lives --;
                if (guess < number){
                    System.out.println("Too low. You have " + lives + " lives left.");
                }
                else {
                    System.out.println("Too high. You have " + lives + " lives left.");
                }
            }
        }
    }
}
