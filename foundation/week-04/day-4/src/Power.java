// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {

    public static void main(String[] args) {
        System.out.println(powerUp(5,3));
    }

    public static int powerUp(int base, int n){
        if (n == 1){
            return base;
        }
        return base * powerUp(base, n - 1);
    }
}
