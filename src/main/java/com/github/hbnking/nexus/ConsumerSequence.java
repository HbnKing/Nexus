package com.github.hbnking.nexus;

import java.util.concurrent.atomic.AtomicLong;

// ConsumerSequence类
class ConsumerSequence {
    private volatile AtomicLong value;

    // 构造函数
    public ConsumerSequence(long initialValue) {
        this.value = new AtomicLong(initialValue);
    }

    // 获取并设置值
    public void getAndSet(long value) {
        this.value.getAndSet(value);
    }

    // 获取当前值
    public long get() {
        return value.get();
    }

    // 设置值
    public void set(long value) {
        this.value.set(value);
    }
}