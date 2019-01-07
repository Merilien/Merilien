package sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {

    public int sum(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

}
