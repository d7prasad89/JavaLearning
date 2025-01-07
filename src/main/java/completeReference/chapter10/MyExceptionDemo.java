package completeReference.chapter10;

public class MyExceptionDemo {

    public static void main(String[] args) {
        int i = 0;
        try {
            throwException(i);
        } catch (MyException e) {
            System.out.println("MyException Caught: "+ e);
        }
    }

    static void throwException(int i) throws MyException {
        if(i == 0) throw new MyException(i);
    }
}
