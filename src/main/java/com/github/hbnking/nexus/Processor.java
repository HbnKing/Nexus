package com.github.hbnking.nexus;

public interface Processor<T> {
    void process(T data);
    void onTimeout(long current);
    <T> void onThrowable(T data, Throwable e);
}