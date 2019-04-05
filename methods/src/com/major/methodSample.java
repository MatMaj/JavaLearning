package com.major;

public class methodSample {
    public int normalInt;
    public static int staticInt=10;
    private int privateInt;

    public int getPrivateInt() {
        return privateInt;
    }

    public void setPrivateInt(int privateInt) {
        this.privateInt = privateInt;
    }

    public static int getStaticInt() {
        return staticInt;
    }

    public static void setStaticInt(int staticInt) {
        methodSample.staticInt = staticInt;
    }

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
    public int addToStatic(int a){
        staticInt+=a;
        return staticInt+a;
    }
}
