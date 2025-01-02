package com.github.hbnking.nexus;

import java.util.concurrent.TimeUnit;

class ArrayUnBlockingQueue<T> {
    private final long INITIAL_VALUE = -1L;
    private long indexMask;
    private String threadName;
    private int bufferSize;
    private Processor<T> processor;
    private Waiter waiter;
    private ProducerSequence put = new ProducerSequence(INITIAL_VALUE) ;
    private ConsumerSequence get = new ConsumerSequence(INITIAL_VALUE) ;
    private volatile Elements elements;
    private ProcessorThread thread;
    private static volatile long cursor = -1L;

    public ArrayUnBlockingQueue(String threadName, int bufferSize, Processor<T> processor, Waiter waiter) {
        this.threadName = threadName;
        this.bufferSize = bufferSize;
        elements = new Elements();
        this.processor = processor;
        this.waiter = waiter;
        this.put = new ProducerSequence(INITIAL_VALUE);
        this.get = new ConsumerSequence(INITIAL_VALUE);
    }

    public void start() {
        // 实现启动逻辑
    }

    public void put(T data) {
        // 实现添加元素逻辑
    }

    public boolean tryPut(T data) {
        // 实现尝试添加元素逻辑
        return true ;
    }

    public void stop() {
        // 实现停止逻辑
    }

    public void stop(long timeout, TimeUnit timeUnit) {
        // 实现带超时停止逻辑
    }


}