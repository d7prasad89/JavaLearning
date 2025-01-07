package completeReference.chapter10;

public class ChainedExceptionDemo {
    void throwChainedException() {
        NullPointerException e = new NullPointerException("Top Layer");
        e.initCause(new ArithmeticException("Cause"));
        throw e;
    }

    public static void main(String[] args) {
        ChainedExceptionDemo chainedExceptionDemo = new ChainedExceptionDemo();
        try {
            chainedExceptionDemo.throwChainedException();
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e);
            System.out.println("Original Cause: " + e.getCause());
        }
    }
}
