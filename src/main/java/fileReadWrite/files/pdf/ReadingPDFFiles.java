package fileReadWrite.files.pdf;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingPDFFiles {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("files/application.pdf");
        if(Files.exists(path)) {
            System.out.println("File exists");
        }
        Files.deleteIfExists(path);
    }
}
