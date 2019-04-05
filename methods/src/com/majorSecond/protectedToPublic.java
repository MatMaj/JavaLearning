package com.majorSecond;

public class protectedToPublic extends inheritPackage{
    @Override
    protected int addProtected(int a, int b) {
        return super.addProtected(a, b);
    }
    public int protectedToPublic(int a, int b){
        System.out.println("Called protected by getter?!?!");
        return addProtected(a,b);
    }
}
