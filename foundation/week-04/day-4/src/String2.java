// Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class String2 {

    public static void main(String[] args) {
        System.out.println(removeXes("xxooooxoetrdtfzguhxxx"));
    }

    public static String removeXes(String string){
        if (string.length() == 0) {
            return "";
        }
        String newChar =  String.valueOf(string.charAt(0));
        if (string.charAt(0) == 'x'){
            newChar = "";
        }
        return newChar + (removeXes(string.substring(1)));
    }
}
