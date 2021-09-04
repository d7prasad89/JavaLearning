package fileReadWrite.files.csv;

import fileReadWrite.modal.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadingCSVFiles {
    public static void main(String[] args) throws FileNotFoundException {
        Path path = Paths.get("files/Sample_CSV.csv");
        if(Files.notExists(path)) {
            throw new FileNotFoundException("The specified file path not found >> "+path);
        }

        try(Stream<String> lines = Files.lines(path)) {
            lines.filter(line -> !line.startsWith("#"))
                    .flatMap(ReadingCSVFiles::lineToUser)
                    .forEach(System.out::println);
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static Stream<User> lineToUser(String line) {
        try {
            String[] elements = line.split(",");
            User user = new User(elements[0], elements[2], Integer.parseInt(elements[3]));
            return Stream.of(user);
        } catch (Exception e) {
            return Stream.empty();
        }
    }
}
