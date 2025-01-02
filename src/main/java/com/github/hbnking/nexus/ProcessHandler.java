package com.github.hbnking.nexus;

// ProcessHandler接口
interface ProcessHandler<T>  extends Runnable{

    boolean isInterrupt();
}

