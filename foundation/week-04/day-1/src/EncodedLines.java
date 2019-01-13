import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt
        decryptFile("encoded-lines.txt");
    }

    public static void decryptFile(String file) {
        try {
            List<String> data = Files.readAllLines(Paths.get(file));
            List<String> decodedData = new ArrayList<>();

            for (String line : data) {
                String newLine = "";
                for (int i = 0; i < line.length(); i++) {
                    int c = (int) line.charAt(i);
                    newLine += (char) (c - 1);
                }
                decodedData.add(newLine);
            }
            Files.write(Paths.get("abc-decoded.txt"), decodedData);
        } catch (IOException e) {
            System.out.println("Something's not OK...");
        }
    }
}