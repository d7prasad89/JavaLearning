package readableCode.exceptionexample;

import java.io.IOException;

public class AddClassExample {
    protected static void checkPositive(int num) throws IOException{
        System.out.println(num);
        throw new IOException("Invalid number");
    }
}
