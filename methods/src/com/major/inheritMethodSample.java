package com.major;

public class inheritMethodSample extends methodSample {
    @Override
    protected int addProtected(int a, int b) {
        return super.addProtected(a, b)+5;
    }

    @Override
    public int addPublic(int a, int b) {
        return super.addPublic(a, b)+2;
    }

    @Override
    public int usePrivate(int a, int b) {
        return super.usePrivate(a, b)+3;
    }
    //we do not inherit private methode form class
}
