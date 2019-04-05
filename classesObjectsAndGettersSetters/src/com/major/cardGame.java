package com.major;

public class cardGame extends game {
    private int numberOfCards;
    private double cardsHeight;
    private double cardsWidth;

    public cardGame(String name, String desc, int age, int numberOfPlayers, int numberOfCards, double cardsHeight, double cardsWidth) {
        super(name, desc, "Card Game", age, numberOfPlayers);
        this.numberOfCards = numberOfCards;
        this.cardsHeight = cardsHeight;
        this.cardsWidth = cardsWidth;
    }

    @Override
    public void playGame() {
        super.playGame();
        System.out.println("They are using "+numberOfCards+ " cards");
    }
}
