// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output
public class Matrix {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        for (int a = 0; a < mat.length; a++){
            String row = "";
            for (int b = 0; b < mat.length; b++){
                if (a == b){
                    mat[a][b] = 1;
                }
                else {
                    mat[a][b] = 0;
                }
            }
        }
    }
}
