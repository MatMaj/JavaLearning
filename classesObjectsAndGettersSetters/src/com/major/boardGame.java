package com.major;

public class boardGame extends game {
    private int numberOfBoards;
    private int numberOfPawns;
    private boolean haveCards;

    public boardGame(String name, String desc, int age, int numberOfPlayers, int numberOfBoards, int numberOfPawns, boolean haveCards) {
        super(name, desc, "Board Game", age, numberOfPlayers);
        this.numberOfBoards = numberOfBoards;
        this.numberOfPawns = numberOfPawns;
        this.haveCards = haveCards;
    }

    @Override
    public void playGame() {
        System.out.println(getNumberOfPlayers()+" players are playing "+ getName() + " and "+ (numberOfPawns-getNumberOfPlayers()) + " pawns left");
    }
    public void checkMethods(){
        super.playGame();
        playGame();
    }
}
