package com.major;

public class paperRPG extends game{
    private int numberOfPages;
    private String[] characterTypes;
    private String leaningCurve;

    public paperRPG(String name, String desc, int age, int numberOfPlayers, int numberOfPages, String[] characterTypes, String leaningCurve) {
        super(name, desc, "Paper RPG", age, numberOfPlayers);
        this.numberOfPages = numberOfPages;
        this.characterTypes = characterTypes;
        this.leaningCurve = leaningCurve;
    }

    @Override
    public void playGame() {
        super.playGame();
        System.out.println("Which book has "+numberOfPages);
    }
}
