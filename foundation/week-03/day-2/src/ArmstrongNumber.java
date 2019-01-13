import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number to check");
        checkArmstrong(scanner.next());
    }

    public static void checkArmstrong(String digits) {
        int sum = 0;
        int len = digits.length();
        for (int i = 0; i < len; i++) {
            int num = Integer.parseInt(digits.substring(i, i + 1));
            for (int j = 0; j < len - 2; j++) {
                num *= num;
            }
            sum += num;
        }
        if (Integer.parseInt(digits) == sum) {
            System.out.println(String.format("The number %s is an Armstrong number.", digits));
        } else {
            System.out.println(String.format("The number %s is not an Armstrong number.", digits));
        }
    }
}
