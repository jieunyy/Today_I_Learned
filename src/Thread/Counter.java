package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    AtomicInteger atomicInt = new AtomicInteger(0);

    public Counter() {

    }

    public void increment(){ // 혹은 sychronized
        atomicInt.incrementAndGet();
    }

    public int getValue() {
        return atomicInt.get();
    }
}
