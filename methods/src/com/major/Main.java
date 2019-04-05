package com.major;

import com.majorSecond.inheritPackage;
import com.majorSecond.protectedToPublic;

public class Main {

    public static void main(String[] args) {
        methodSample methodSample=new methodSample();
        System.out.println(methodSample.addProtected(5,5));//in range of one package
        System.out.println(methodSample.addPublic(2,2));//always in range
        System.out.println(methodSample.usePrivate(3,3));//in range of one class
        inheritMethodSample inheritMethodSample=new inheritMethodSample();
        System.out.println(inheritMethodSample.addProtected(5,5));
        System.out.println(inheritMethodSample.addPublic(2,2));
        System.out.println(inheritMethodSample.usePrivate(3,3));
        //we can get private method from method sample only by creating method that will call original
        //method from methodSample class by using super keyword
        //otherwise we do not inherit private methods between classes
        inheritPackage inheritPackage = new inheritPackage();
        //System.out.println(inheritPackage.addProtected(5,5)); //we cant use protected methods from one to other package
        //protected only in package range
        System.out.println(inheritPackage.addPublic(2,2));
        System.out.println(inheritPackage.usePrivate(3,3));
        protectedToPublic protectedToPublic = new protectedToPublic();
        System.out.println(protectedToPublic.protectedToPublic(5,5));
        //we can inherit only one class, it can be inherited in multiple different classes
    }
}
