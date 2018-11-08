import java.util.ArrayList;

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(getBestSeat(1));
        System.out.println(getBestSeat(2));
        System.out.println(getBestSeat(3));
        System.out.println(getBestSeat(7));
        System.out.println(getBestSeat(12));
        System.out.println(getBestSeat(41));
    }

    public static int getBestSeat(int people) {
        ArrayList<Integer> circle = new ArrayList<Integer>();
        for (int i = 0; i < people; i++) {
            circle.add(i+1);
        }
        while (circle.size() > 1) {
            for (int i = 0; i < circle.size(); i++) {
                if (i == circle.size() - 1){circle.remove(0);}
                else {circle.remove(i + 1);}
            }
        }
        return circle.get(0);
    }
}
