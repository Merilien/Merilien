// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
public class DrawChessTable {
    public static void main(String[] args) {
        for (int a = 1; a <= 8; a++){
            if (a % 2 == 0) {
                System.out.println(" % % % %");
            }
            else{
                System.out.println("% % % % ");
            }
        }
    }
}
