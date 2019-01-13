// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.nio.file.Files;
import java.nio.file.Paths;

public class CountLines {
    public static void main(String[] args) {
        System.out.println(countLines("textfile.txt"));
    }

    public static int countLines(String file) {
        try {
            return Files.readAllLines(Paths.get(file)).size();
        } catch (Exception e) {
            return 0;
        }
    }
}
