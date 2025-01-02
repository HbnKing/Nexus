package com.github.hbnking.nexus;

// TimeoutWaiter类继承自Waiter
class TimeoutWaiter implements Waiter{
    private final Object lock = new Object();
    private boolean condition;
    private long timeout;

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
        synchronized (lock) {
            condition = true;
            lock.notifyAll();
        }
    }
}
