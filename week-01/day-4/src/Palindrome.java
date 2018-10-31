//Create a function named create palindrome following your current language's style guide.
// It should take a string, create a palindrome from it and then return it.
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(createPalindrome("hhhrrrrrrfhhhrf"));
    }

    public static String createPalindrome(String word){
        String pali = word;
        for (int a=word.length()-1; a>=0; a--){
            pali += word.charAt(a);
        }
        return pali;
    }
}
