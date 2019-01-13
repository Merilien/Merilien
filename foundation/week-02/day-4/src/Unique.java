import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        System.out.println(returnUnique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
    }

    public static String returnUnique(int[] list) {
        int len = list.length;
        int[] dupList = new int[len];
        int duplicateCount = 0;
        for (int a = 0; a < len; a++) {
            for (int b = a + 1; b < len; b++) {
                if (list[a] == list[b]) {
                    duplicateCount += 1;
                    dupList[b] = 1;
                }
            }
        }
        int[] uniqList = new int[len - duplicateCount];
        int uniqIndex = 0;
        for (int a = 0; a < len; a++) {
            if (dupList[a] == 0) {
                uniqList[uniqIndex] = list[a];
                uniqIndex += 1;
            }
        }
        return Arrays.toString(uniqList);
    }
}