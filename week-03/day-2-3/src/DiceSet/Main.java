package DiceSet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DiceSet myDice = new DiceSet();
        myDice.roll();
        int rollsNeeded = 0;
        while (!checkIfSixes(myDice.getCurrent())){
            myDice.reroll();
            rollsNeeded++;
        }
        System.out.println(myDice.getCurrent());
        System.out.println("Rolls needed: " + rollsNeeded);
    }

    public static boolean checkIfSixes(ArrayList<Integer> dice){
        boolean sixes = true;
        for (int die : dice){
            if (die !=6){
                sixes = false;
            }
        }
        return sixes;
    }
}
