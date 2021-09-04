package fileReadWrite.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingFiles {
    public static void main(String[] args) throws FileNotFoundException {
        Path path = Paths.get("files/hello.txt");
        if(Files.notExists(path)) {
            throw new FileNotFoundException("Given file path not found " + path);
        }
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String line = bufferedReader.readLine();
            while (line!=null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
