import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    public static String ticTacResult(String file){
        try{
            List<String> result = Files.readAllLines(Paths.get(file));
            String xwin = "XXX";
            String owin = "OOO";

            //check diagonals
            String diag1 = "" + result.get(0).charAt(0) + result.get(1).charAt(1) + result.get(2).charAt(2);
            String diag2 = "" + result.get(2).charAt(0) + result.get(1).charAt(1) + result.get(0).charAt(2);
            if (diag1.equals(xwin) || diag2.equals(xwin)){ return "X";}
            else if (diag1.equals(owin) || diag2.equals(owin)){ return "O";}

            //check rows & columns
            for (int i = 0; i < result.size(); i++) {
                //rows
                String row = result.get(i);
                //columns
                String column = "";
                for (int j = 0; j < result.size(); j++) {
                    column += result.get(j).charAt(i);
                }
                if (column.equals(xwin) || row.equals(xwin)){ return "X";}
                else if (column.equals(owin) || row.equals(owin)){return "O";}
            }

            return "Draw";

        } catch (IOException e){
            System.out.println("Can't read file.");
        }
        return null;
    }
}