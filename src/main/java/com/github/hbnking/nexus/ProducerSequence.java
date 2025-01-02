package com.github.hbnking.nexus;

import java.util.concurrent.atomic.AtomicLong;

class ProducerSequence {
    private volatile AtomicLong value;

    // 构造函数
    public ProducerSequence(long initialValue) {
        this.value = new AtomicLong(initialValue);
    }

    // 获取AtomicLong类型的值
    public AtomicLong getValue() {
        return value;
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