package com.github.hbnking.nexus;

// ProcessThread类
class ProcessThread<T>  implements ProcessHandler{

    public ProcessThread(){}

    private Element<T>[] elements;
    private ProcessHandler<T> handler;

    public ProcessThread(Element<T>[] elements, ProcessHandler<T> handler) {
        this.elements = elements;
        this.handler = handler;
    }

    public void run() {
        //
    }


    @Override
    public boolean isInterrupt() {
        return false;
    }
}
