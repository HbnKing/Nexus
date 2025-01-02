package com.github.hbnking.nexus;

import java.util.concurrent.atomic.AtomicLong;

// ProducerSequence类
class ProducerSequence<Class> {
    private AtomicLong value = new AtomicLong(0);

    public long getValue() {
        return value.get();
    }

    public void setValue(long value) {
        this.value.set(value);
    }
}
