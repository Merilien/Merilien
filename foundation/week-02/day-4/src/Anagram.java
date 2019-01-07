import java.util.Arrays;

// Create a function named is anagram following your current language's style guide.
// It should take two strings and return a boolean value depending on whether its an anagram or not.
public class Anagram {
    public static void main(String[] args) {
        System.out.println(checkAnagram("dog", "god"));
    }

    public static boolean checkAnagram(String word1, String word2){
        boolean isAnagram = true;
        if (word1.length() != word2.length()) {
            isAnagram = false;
        }
        else{
            int len = word1.length();
            int[] letters = new int[len];
            for (int a = 0; a < len; a++){
                for (int b = 0; b < len; b++){
                    if ((word1.charAt(a) == word2.charAt(b)) && (letters[b] == 0)){
                        letters[b] = 1;
                    }
                }
            }
            for (int a = 0; a < len; a++){
                if (letters[a] == 0){
                    isAnagram = false;
                    break;
                }
            }
        }
        return isAnagram;
    }
}

