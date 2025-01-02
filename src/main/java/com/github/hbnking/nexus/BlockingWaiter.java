package com.github.hbnking.nexus;

// BlockingWaiter类继承自Waiter
class BlockingWaiter implements Waiter {
    private final Object lock = new Object();
    private boolean condition;

    @Override
    public long wait(long next, ProducerSequence put, ProcessHandler handler) {
        synchronized (lock) {
            try {
                while (!condition) {
                    lock.wait();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        return 0 ;
    }

    @Override
    public void signal() {
        synchronized (lock) {
            condition = true;
            lock.notifyAll();
        }
    }
}
