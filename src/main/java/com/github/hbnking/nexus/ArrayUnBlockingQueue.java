package com.github.hbnking.nexus;

// ArrayUnBlockingQueue类
class ArrayUnBlockingQueue<T> {
    final long INITIAL_VALUE=-1l;

    final long indexMask;
    final String threadName;
    final int bufferSize;
    final Processor<T> processor;
    final Waiter waiter;
    final ProducerSequence put = new ProducerSequence(INITIAL_VALUE);
    final ConsumerSequence get = new ConsumerSequence(INITIAL_VALUE);
    volatile Elements elements;
    ProcessorThread thread;

    public ArrayUnblockingQueue(String threadName, int bufferSize, Processor<T> processor, Waiter waiter){


    }


    void start(){}
    void put(T data){}
    boolean tryPut(T data){}
    void stop(){}
    void stop(long timeout, TimeUnit timeUnit){}


}
