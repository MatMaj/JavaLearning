package com.majorSecond;

import com.major.methodSample;

public class inheritPackage extends methodSample {
    @Override
    protected int addProtected(int a, int b) {
        System.out.println("Other package");
        return super.addProtected(a, b);
    }

    @Override
    public int addPublic(int a, int b) {
        System.out.println("Other package");
        return super.addPublic(a, b);
    }

    @Override
    public int usePrivate(int a, int b) {
        System.out.println("Other package");
        return super.usePrivate(a, b);
    }
}
