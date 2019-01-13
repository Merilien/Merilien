import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class Lottery {

    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv
        System.out.println(findMostCommons("lottery.csv"));
    }

    public static HashMap<String, Integer> findMostCommons(String file) {
        ArrayList<String> nums = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();
        try {
            for (String line : Files.readAllLines(Paths.get(file))) {
                String[] splitLine = line.split(";");
                for (int i = 11; i < 16; i++) {
                    String num = splitLine[i];
                    if (nums.contains(num)) {
                        int index = nums.indexOf(num);
                        counts.set(index, counts.get(index) + 1);
                    } else {
                        nums.add(num);
                        counts.add(0);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Can't read file.");
        }

        HashMap<String, Integer> maxCounts = new HashMap<>();
        while (maxCounts.size() < 5) {
            int max = 0;
            for (int count : counts) {
                if (count > max) {
                    max = count;
                }
            }
            for (int i = 0; i < nums.size(); i++) {
                if (counts.get(i) == max) {
                    maxCounts.put(nums.get(i), counts.get(i));
                    nums.remove(i);
                    counts.remove(i);
                }
            }
        }
        return maxCounts;
    }
}