import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an odd number!");
        int height = scanner.nextInt();
        for (int a = 1; a <= height; a += 2) {
            String spaces = "";
            String stars = "";
            for (int b = 1; b <= a; b++) {
                stars += "*";
            }
            for (int b = 1; b <= (height - a) / 2; b++) {
                spaces += " ";
            }
            System.out.println(spaces + stars + spaces);
        }
        for (int a = height-2; a > 0; a -= 2) {
            String spaces = "";
            String stars = "";
            for (int b = 1; b <= a; b++) {
                stars += "*";
            }
            for (int b = 1; b <= (height - a) / 2; b++) {
                spaces += " ";
            }
            System.out.println(spaces + stars + spaces);
        }

    }
}
