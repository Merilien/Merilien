package cowsandbulls;

import java.util.Scanner;

public class CowsAndBulls {
    private String num;
    private String gameState;
    private int guessCounter;

    public CowsAndBulls(){
        gameState = "playing";
        guessCounter = 0;
        num = String.valueOf((int) (Math.random() * 9001) + 1000);
//        System.out.println(num);
    }


    public void playGame() {
        if (gameState.equals("finished")) {
            checkGameState();
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the 4-digit number");
        while (gameState.equals("playing")) {
            if (guessCounter == 10) {
                System.out.println("Come on, you can do it!");
            }
            System.out.println(guess(askForNumber(scanner)));
        }
    }

    private int askForNumber(Scanner scanner) {
        int guessedNum = scanner.nextInt();
        boolean fourDigits = guessedNum < 10000 || guessedNum > 1000;
        while (!fourDigits) {
            System.out.println("4 digits pls.");
            askForNumber(scanner);
        }
        return guessedNum;
    }

    private String guess(int guessedNum) {
        guessCounter++;
        String guessed = String.valueOf(guessedNum);
        if (guessed.equals(num)) {
            gameState = "finished";
            return "4 cows, you won the game!";
        }
        int cows = 0;
        int bulls = 0;
        for (int i = 0; i < 4; i++) {
            if (num.charAt(i) == guessed.charAt(i)) {
                cows++;
                guessed = guessed.replaceFirst(guessed.charAt(i) + "", "-");
//            } else
//                for (int j = 0; j < 4; j++) {
//                    if (num.charAt(i) == guessed.charAt(j)) {
//                        bulls++;
//                        guessed = guessed.replaceFirst(guessed.charAt(j) + "", "-");
//                    }
                }
        }
        return String.format("%d cows, %d bulls.", cows, bulls);
    }


    public void checkGameState() {
        System.out.println("Game is " + (gameState == "finished" ?  "not " : "") + "playable.");
    }



}
