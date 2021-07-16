package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        List <House> positionList = new ArrayList<>();
        House house = new House();
        FirstPosition firstPosition = new FirstPosition();
        SecondPosition secondPosition = new SecondPosition();
        ThirdPosition thirdPosition = new ThirdPosition();
        positionList.add(firstPosition);
        positionList.add(secondPosition);
        positionList.add(thirdPosition);
        Player player = new Player();
        for (int i = 0; true; i++) {
            System.out.println(house);
            System.out.println("\nPick a window to Attack (1 - 3) : ");
            int input = scan.nextInt();
            player.takeTurn();
            System.out.println(positionList.get(player.currentPosition - 1));
            if (input == player.currentPosition) {
                System.out.println("HIT!!! +25 pts");
                player.score += 25;
                player.hits++;
            } else {
                System.out.println("MISS :(");
                player.lives--;
            }
            if ( player.lives == 0 || player.hits == 3)
            break;
        }
        if (player.hits >= 3) {
            System.out.println("Target Eliminated, you WIN!!!  +200 pts");
            player.score += 200;
        } else {
            System.out.println("Game over");
        }
        System.out.println("Final Score: " + player.score);
    }
}
