//Create a function named search palindrome following your current language's style guide.
// It should take a string, search for palindromes that at least 3 characters long
// and return a list with the found palindromes.

public class SearchPalindrome {
    public static void main(String[] args) {
        System.out.println(searchPalindrome("salalallaal").toString());
    }

    public static String[]searchPalindrome(String stringy){
        int len = stringy.length();
        String palis = "";
        for (int a = 1; a < len-1;a++){
            if (stringy.charAt(a-1) == stringy.charAt(a+1)){
                stringy()

            }

        }
    }

    public static boolean isPalindrom(String substring) {
        int len = substring.length();
        boolean isPali = true;
        for (int a = 1; a < len/2; a++){
            if (substring.charAt(len/2-a)!=(substring.charAt(len/2-a)){
                isPali = false;
                break;
            }
        }
    }
}
