package com.major;

public class game {
    private String name;
    private String desc;
    private String type;
    private int age;
    private int numberOfPlayers;

    public game(String name, String desc, String type, int age, int numberOfPlayers) {
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.age = age;
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void playGame(){
        System.out.println(numberOfPlayers+" people are playing "+name);
    }
}
