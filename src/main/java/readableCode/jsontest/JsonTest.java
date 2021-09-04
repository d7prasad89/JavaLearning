package readableCode.jsontest;

import com.google.gson.Gson;
import readableCode.jsontest.model.SampleData;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonTest {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("test.json");
            BufferedReader bufferedReader = new BufferedReader(Files.newBufferedReader(path));
            SampleData sampleData = new Gson().fromJson(bufferedReader, SampleData.class);
            System.out.println(sampleData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
