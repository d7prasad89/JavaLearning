package completeReference.chapter10;

public class MyException extends Exception{
    private final int detail;

    public MyException(int i) {
        this.detail = i;
    }

    @Override
    public String toString() {
        return "MyException {" +
                "detail=" + detail +
                '}';
    }
}
