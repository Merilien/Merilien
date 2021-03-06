import java.util.*;

public class QuoteSwap {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(swapQuote(list));
        // Expected output: "What I cannot create I do not understand."
    }

    public static String swapQuote(ArrayList<String> quote) {
        String word = quote.get(2);
        quote.set(2, quote.get(5));
        quote.set(5, word);
        String fixed = "";
        for (int i = 0; i < quote.size(); i++) {
            fixed += " " + quote.get(i);
        }
        return fixed;
    }
}