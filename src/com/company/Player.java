package com.company;

public class Player {
    int lives = 5;
    int score = 0;
    int hits = 0;
    int currentPosition;

    public Player(){

    }
    public void takeTurn(){
        currentPosition = (int) (Math.random() * 3) + 1;
    }
}
