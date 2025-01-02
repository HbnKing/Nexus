package com.github.hbnking.nexus;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// TimeoutWaiter类继承自Waiter
class TimeoutWaiter implements Waiter{
    private ReentrantLock lock = new ReentrantLock() ;
    private Condition notifyCondition = lock.newCondition() ;

    private TimeoutException exception = new TimeoutException();

    private AtomicBoolean needSignal = new AtomicBoolean(false);
    private final long timeout;

    public TimeoutWaiter(long timeout) {
        this.timeout = timeout;
    }

    @Override
    public long wait(long next, ProducerSequence put, ProcessHandler handler) {
        synchronized (lock) {
            try {
                lock.wait(timeout);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        return 0 ;
    }

    @Override
    public void signal() {

    }
}
