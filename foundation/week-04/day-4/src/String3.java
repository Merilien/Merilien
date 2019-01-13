// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
public class String3 {

    public static void main(String[] args) {
        System.out.println(addStars("xxooooxoetrdtfzguhxxx"));
    }

    public static String addStars(String string) {
        if (string.length() == 1) {
            return string;
        }
        return string.charAt(0) + "*" + (addStars(string.substring(1)));
    }
}
