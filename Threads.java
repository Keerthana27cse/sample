class Newthreads extends Thread {
    private volatile boolean suspended = false;

    synchronized void suspendThread() {
        suspended = true;
    }

    synchronized void resumeThread() {
        suspended = false;
        notify();
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i < 10; i++) {
                while (suspended) {
                    try {
                        wait();  // waits until notified
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted");
                    }
                }
                System.out.println(i);
                try {
                    Thread.sleep(500); // slow down to see the effect
                } catch (InterruptedException e) {
                    System.out.println("Sleep interrupted");
                }
            }
        }
    }
}
public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Newthreads n = new Newthreads();
        n.start();

        Thread.sleep(5000); // Let it print a few numbers
        n.suspendThread();  // Suspend the thread
        System.out.println("Thread suspended");

        Thread.sleep(5000); // Wait while thread is suspended

        n.resumeThread();  // Resume the thread
        System.out.println("Thread resumed");
    }
}
