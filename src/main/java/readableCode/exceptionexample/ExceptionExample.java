package readableCode.exceptionexample;

import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) throws IOException {
        checkNumber(0);
    }

    private static void checkNumber(int num) throws IOException {
        AddClassExample.checkPositive(num);
    }


}
