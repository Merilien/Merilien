import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines do you want?");
        int height =scanner.nextInt();
        for (int a = 1; a<=height*2; a+=2){
            String spaces = "";
            String stars = "";
            for (int b=1; b<=a; b++){
                stars += "*";
            }
            for (int b=1;b<=(height*2-a)/2; b++){
                spaces += " ";
            }
            System.out.println(spaces+stars+spaces);
        }
    }
}
