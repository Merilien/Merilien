//Create a function named search palindrome following your current language's style guide.
// It should take a string, search for palindromes that at least 3 characters long
// and return a list with the found palindromes.

import java.util.ArrayList;
import java.util.Arrays;

public class SearchPalindrome {
    public static void main(String[] args) {
        System.out.println(searchPalindrome("salalallaal"));
    }

    public static ArrayList<String> searchPalindrome(String string) {
        int len = string.length();
        ArrayList<String> palis = new ArrayList<>();
        for (int i = 0; i <= len - 2; i++) {
            for (int j = i + 2; j < len; j++) {
                String substring = string.substring(i, j + 1);
                if (isPalindrom(substring)) {
                    palis.add(substring);
                }
            }
        }
        return palis;
    }

    public static boolean isPalindrom(String substring) {
        int len = substring.length();
        boolean isPali = true;
        for (int a = 0; a <= len / 2; a++) {
            if (substring.charAt(a) != substring.charAt(len - 1 - a)) {
                isPali = false;
                break;
            }
        }
        return isPali;
    }
}
