package com.github.hbnking.nexus;

// 抽象等待者类
interface Waiter {
    long wait(long next, ProducerSequence put, ProcessHandler handler);

    void signal();
}
