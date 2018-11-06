//Create a function named search palindrome following your current language's style guide.
// It should take a string, search for palindromes that at least 3 characters long
// and return a list with the found palindromes.

public class SearchPalindrome {
    public static void main(String[] args) {
        System.out.println(searchPalindrome("salalallaal").toString());
    }

    public static String[] searchPalindrome(String stringy){
        int len = stringy.length();
        int maxpalis = 0;
        for (int i=1; i<len-2; i++){
            maxpalis += i;
        }
        String[] palist = new String[maxpalis];
        int paliCount = 0;
        int palindex = 0;
        for (int i = 0; i<=len-2; i++) {
            for (int j = i + 2; j < len; j++) {
                String substring = stringy.substring(i, j + 1);
                if (isPalindrom(substring)) {
                    palist[palindex] = substring;
                    paliCount++;
                    palindex++;
                }
            }
        }
        String[] endlist = new String[paliCount];
        for (int i = 0; i<paliCount; i++){
            endlist[i] = palist[i];
        }
        return endlist;
    }

    public static boolean isPalindrom(String substring) {
        int len = substring.length();
        boolean isPali = true;
        for (int a = 0; a<= len/2; a++){
            if (substring.charAt(a) != substring.charAt(len-1-a)) {
                isPali = false;
                break;
            }
        }
        return isPali;
    }
}
