// Create a recursive function called `refactorio`
// that returns it's input's factorial

public class Refactorio {

    public static void main(String[] args) {
        System.out.println(refactorio(4));
    }

    public static int refactorio(int n){
        if (n == 1){
            return n;
        }
        return n * refactorio(n - 1);
    }
}
