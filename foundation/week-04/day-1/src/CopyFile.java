// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        copyFile("textfile.txt", "newtext.txt");
    }

    public static boolean copyFile(String file1, String file2) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(file1));
            Files.write(Paths.get(file2), lines);
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
