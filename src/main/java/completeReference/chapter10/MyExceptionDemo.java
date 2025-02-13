package completeReference.chapter10;

import java.util.Arrays;

public class MyExceptionDemo {

    public static void main(String[] args) {
        int i = 0;
        try {
            throwException(i);
        } catch (MyException e) {
            System.out.println("MyException Caught: "+ Arrays.toString(e.getStackTrace()));
        }
    }

    static void throwException(int i) throws MyException {
        if(i == 0) throw new MyException(i);
    }
}
