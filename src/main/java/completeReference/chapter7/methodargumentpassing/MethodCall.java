package completeReference.chapter7.methodargumentpassing;

public class MethodCall {

    public void test() {
        System.out.println("Inside Test");
    }

    public void test1() {
        System.out.println("Inside Test1");
        test();
    }

    public static void main(String[] args) {
        MethodCall methodCall = new MethodCall();
        methodCall.test1();
    }
}
