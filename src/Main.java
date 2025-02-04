import Thread.Counter;
import Thread.IncrementThread;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread[] threads = new Thread[10];

        for(int i=0; i < threads.length; i++) {
            threads[i] = new Thread(new IncrementThread(counter));
            threads[i].start();
        }

        try {
            for(Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getValue());
    }
}