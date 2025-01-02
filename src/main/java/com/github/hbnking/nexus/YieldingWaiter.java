package com.github.hbnking.nexus;

// YieldingWaiter类继承自Waiter
class YieldingWaiter implements Waiter {
    private final int SPIN_TRIES = 100;


    @Override
    public long wait(long next, ProducerSequence put, ProcessHandler handler) {
        while (true) {
           // todo
            return 0;
        }
        //return 0 ;
    }


    @Override
    public void signal() {
    }

    public int applywaitmethod(int counter){

        return 0 ;
    }
}
