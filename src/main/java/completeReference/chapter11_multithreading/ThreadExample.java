package completeReference.chapter11_multithreading;

public class ThreadExample {
    public static void main(String[] args) {

        System.out.println("Main thread starting.");

        CustomThread newThread = new CustomThread();
        newThread.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }

        System.out.println("Main thread ending.");
    }
}
