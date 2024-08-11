package thread;

// Create multiple threads.
class NewThread1 implements Runnable {
    String name; // name of thread
    Thread t;

    NewThread1(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
    }

    // This is the entry point for thread.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread1 nt1 = new NewThread1("One");
        NewThread1 nt2 = new NewThread1("Two");
        NewThread1 nt3 = new NewThread1("Three");
        // Start the threads.
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        try {
            // wait for other threads to end
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
