import java.util.HashMap;

public class Roman {
//    private static HashMap<Integer, String> map;
////
////    static {
////        map = new HashMap<>();
////        map.put(1,"I");
////        map.put(5,"V");
////        map.put(10,"X");
////        map.put(50,"L");
////        map.put(100,"C");
////        map.put(500,"D");
////        map.put(1000,"M");
////    }

    public static void main(String[] args) {
        System.out.println(convertToRoman(1745));
    }

    public static String convertToRoman(int num) {
        String roman = "";
        if (num >= 1000) {
            if (num < 4000) {
                for (int i = 1; i <= (num / 1000); i++) {
                    roman += "M";
                }
                roman += convertToRoman(num % 1000);
            } else {
                return "Number too large :(";
            }
        } else if (num >= 100) {
            if (num < 400) {
                for (int i = 1; i <= (num / 100); i++) {
                    roman += "C";
                }
                roman += convertToRoman(num % 100);
            } else if (num < 500) {
                roman += "CD";
                roman += roman += convertToRoman(num % 100);
            } else {
                roman += "D";
                roman += convertToRoman(num % 100);
            }
        } else if (num >= 10) {
            if (num < 40) {
                for (int i = 1; i <= (num / 10); i++) {
                    roman += "X";
                }
                roman += convertToRoman(num % 10);
            } else if (num < 50) {
                roman += "XL";
                roman += roman += convertToRoman(num % 10);
            } else {
                roman += "L";
                roman += convertToRoman(num % 10);
            }
        } else if (num > 0){
            if (num < 4) {
                for (int i = 1; i <= num; i++) {
                    roman += "I";
                }
            } else if (num < 5) {
                roman += "IV";
            } else {
                roman += "V";
            }
        }
        return roman;
    }

}
