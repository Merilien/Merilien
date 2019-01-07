// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {
    public static void main(String[] args) {
        System.out.println(swapXes("xxooooxoetrdtfzguhxxx"));
    }

    public static String swapXes(String string){
        if (string.length() == 0) {
            return "";
        }
        char newChar = string.charAt(0);
        if (string.charAt(0) == 'x'){
            newChar = 'y';
        }
        return newChar + (swapXes(string.substring(1)));
    }

}
