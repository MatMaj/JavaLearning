package com.major;

public class methodSample {
    private int addPrivate(int a, int b){
        return a+b;
    }
    protected int addProtected(int a, int b){
        return a+b;
    }
    public int addPublic(int a, int b){
        return a+b;
    }
    public int usePrivate(int a, int b){
        return addPrivate(a,b);
    }
}
