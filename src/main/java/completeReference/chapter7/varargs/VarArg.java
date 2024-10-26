package completeReference.chapter7.varargs;

public class VarArg {
    public static void main(String[] args) {
        VarArg.test(2,3,4);
    }

    public static void test(int... v) {
        for (int i: v) {
            System.out.println(i);
        }
    }
}
