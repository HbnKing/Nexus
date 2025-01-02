package com.github.hbnking.nexus;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// BlockingWaiter类继承自Waiter
class BlockingWaiter implements Waiter {
    private final ReentrantLock lock = new ReentrantLock() ;
    private Condition notifyCondition = lock.newCondition() ;

    private AtomicBoolean needSignal = new AtomicBoolean(false);

    @Override
    public long wait(long next, ProducerSequence put, ProcessHandler handler) {
        synchronized (lock) {

        }
        return 0 ;
    }

    @Override
    public void signal() {

    }
}
