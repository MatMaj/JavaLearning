package com.major;

public class loopTypes {
    public void forLoop(int times){
        if(times<0){
            System.out.println("Number of loops is lesser than zero! Converting value to |value|");
            times=times*-1;
            for(int i=0; i<=times; i++){
                System.out.println("For: "+i);
            }
        }else if(times>0){
            for(int i=0; i<=times; i++){
                System.out.println("For: "+i);
            }
        }else{
            System.out.println("Value equals zero so we don't have any loops");
        }
    }
    public void whileLoop(int times){
        if(times<0){
            System.out.println("Number of loops is lesser than zero! Converting value to |value|");
            times=times*-1;
            while(times>0){
                System.out.println(times);
                times-=2;
            }
        }else if(times>0){
            while(times>0){
                System.out.println(times);
                times-=2;
            }
        }else{
            System.out.println("Value equals zero so we don't have any loops");
        }
    }
    public void doWhileLoop(int times){
        do{
            System.out.println("Operation "+ times);
            times-=3;
        }while (times>0);
    }
    public void forEach(String[] tab){
        for (String i:tab) {
            System.out.println(i);
        }
    }
}
