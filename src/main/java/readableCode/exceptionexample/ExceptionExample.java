package readableCode.exceptionexample;

import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) throws IOException, RuntimeException {
        //checkNumber(0);
        test();
        System.out.println("After");
    }

    private static void checkNumber(int num) throws IOException {
        AddClassExample.checkPositive(num);
    }

    public static void test(){
        if(true) throw new RuntimeException("Exception");
        System.out.println("");
    }



}
