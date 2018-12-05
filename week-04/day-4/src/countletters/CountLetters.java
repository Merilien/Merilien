package countletters;

import java.util.HashMap;

public class CountLetters {

    public static HashMap<String, Integer> counter(String s) {
        HashMap<String, Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String letter = "" + s.charAt(i);
            if (counts.containsKey(letter)) {
                counts.put(letter, counts.get(letter) + 1);
            } else {
                counts.put(letter, 1);
            }
        }
        return counts;
    }
}
