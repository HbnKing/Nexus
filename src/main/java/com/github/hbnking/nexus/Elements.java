package com.github.hbnking.nexus;

public class Elements<T> {

    private  Element<T>[] elements ;

    public Elements(){
        elements = new Element[128];

    }


    public Element<T> elementAt(long sequence){
        return elements[1];
    }

    // Element类
    static class Element<T> {
        private  T value;


    }
}
