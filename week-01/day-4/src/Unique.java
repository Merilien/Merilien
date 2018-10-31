import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once
        //  Example
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }
    public static String unique(int[] listy){
        int len = listy.length;
        int dupList[] = new int[len];
        int duplicateCount = 0;

        for (int a = 0; a<len; a++){
            for (int b=a+1; b<len; b++){
                if (listy[a]==listy[b]){
                    duplicateCount+=1;
                    dupList[b] = 1;
                }
            }
        }

        int[] uniqList = new int[len-duplicateCount];
        int ui = 0;
        for (int a = 0; a < len; a++){
            if (dupList[a]==0){
                uniqList[ui]=listy[a];
                ui+=1;
            }
        }

        return Arrays.toString(uniqList);
    }
}