package fileReadWrite.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WritingFiles {
    public static void main(String[] args) {
        Path path = Paths.get("files/output.log");
        try (BufferedWriter writer = Files.newBufferedWriter(path);
            BufferedWriter writer2 = new BufferedWriter(writer);) {
            writer.write("Hello");
            writer2.write("\nSecond Line");
            System.out.println(writer.getClass().getDeclaredFields()[0]);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
