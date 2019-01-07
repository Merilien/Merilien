import java.util.Scanner;

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
public class GuessTheNumber {
    public static void main(String[] args) {
        int num = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number!");
        boolean guessedRight = false;
        while (!guessedRight){
            int guess = scanner.nextInt();
            if(guess < num) {
                System.out.println("The stored number is higher");
            }
            else if (guess > num) {
                System.out.println("The stored number is lower");
            }
            else {
                guessedRight = true;
                System.out.println("You found the number: " + num);
            }
        }
    }
}
