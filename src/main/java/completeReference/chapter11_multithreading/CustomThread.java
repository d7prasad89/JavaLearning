package completeReference.chapter11_multithreading;

public class CustomThread extends Thread {
    CustomThread() {
        super("Demo Thread");
        System.out.println("Child thread: " + this);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
