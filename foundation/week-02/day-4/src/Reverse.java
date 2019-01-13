// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
public class Reverse {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int len = aj.length;
        for (int a = 0; a < len / 2; a++) {
            int currentEl = aj[a];
            aj[a] = aj[len - 1 - a];
            aj[len - 1 - a] = currentEl;
        }
        for (int a = 0; a < len; a++) {
            System.out.print(aj[a] + " ");
        }

    }
}
