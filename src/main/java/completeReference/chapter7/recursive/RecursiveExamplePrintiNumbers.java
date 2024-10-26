package completeReference.chapter7.recursive;

public class RecursiveExamplePrintiNumbers {
    int[] values = new int[10];
    public static void main(String[] args) {
        RecursiveExamplePrintiNumbers re = new RecursiveExamplePrintiNumbers();

        for (int i = 0; i < 10; i++) {
            re.values[i] = i;
        }
        re.printNumbers(10);
    }

    void printNumbers(int n) {
        if(n == 0) {
            return;
        }
        printNumbers(n-1);
        System.out.println("Value of: " + (n-1) + " is " + values[n-1]);
    }
}
