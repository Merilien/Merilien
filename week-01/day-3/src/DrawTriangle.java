import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines do you want?");
        int height = scanner.nextInt();
        for (int a = 1; a <= height; a++){
            String starline = "";
            for (int b = 1; b <= a; b++){
                starline += "*";
            }
            System.out.println(starline);
        }
    }
}
