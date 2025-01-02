package com.github.hbnking.nexus;

// YieldingWaiter类继承自Waiter
class YieldingWaiter implements Waiter {
    private final int SPIN_TRIES = 100;
    private int spinCount = 0;

    @Override
    public long wait(long next, ProducerSequence put, ProcessHandler handler) {
        while (!tryAcquire()) {
            if (spinCount >= SPIN_TRIES) {
                Thread.yield();
                spinCount = 0;
            } else {
                spinCount++;
            }
        }
        return 0 ;
    }

    protected boolean tryAcquire() {
        return false;
    }

    @Override
    public void signal() {
    }
}
