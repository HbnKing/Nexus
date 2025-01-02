package com.github.hbnking.nexus;

// SleepingWaiter类继承自Waiter
class SleepingWaiter implements Waiter{
    private int retries = 0;

    @Override
    public long wait(long next, ProducerSequence put, ProcessHandler handler) {

        return 0 ;
    }

    @Override
    public void signal() {
    }


    public int applywaitmethod(int counter){

        return 0 ;
    }
}
