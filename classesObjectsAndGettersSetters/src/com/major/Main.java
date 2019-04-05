package com.major;

public class Main {

    public static void main(String[] args) {
        boardGame boardGame1 = new boardGame("Talisman","Fantasy game with dragons",5,3,
                10,5,true);
        boardGame1.playGame();
        boardGame1.checkMethods();
        System.out.println(boardGame1.getName());
        System.out.println(boardGame1.getType());
        cardGame cardGame1=new cardGame("Cards Against Humanity","Weird, funny and horryfying cards",18,5,500,72,42);
        cardGame1.playGame();
    }
}
