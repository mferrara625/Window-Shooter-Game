package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        Scanner scan = new Scanner(System.in);
        House house = new House();
        Player player = new Player();
        System.out.println(house);
        for (int i = 0; true; i++) {
//            System.out.println(house);
            System.out.println("\nPick a window to Attack (1 - 3) : ");
            int input = scan.nextInt();
            player.takeTurn();
            if (player.currentPosition == 1) {
                if (input == 1) {
                    house.topOf1 = "︻┳═一** ";
                    house.window1 = "(︡> _⦣<︠)";
                } else if (input == 2) {
                    house.window1 = "(︡• _⦣•︠)";
                    house.window2 = "︻┳═一**_";
                } else if (input == 3){
                    house.window1 = "(︡• _⦣•︠)";
                    house.window3 = "︻┳═一**_";
                }
            }
                else if (player.currentPosition == 2) {
                    if (input == 2){
                        house.topOf2 = "︻┳═一** ";
                        house.window2 = "(︡> _⦣<︠)";
                    }
                    else if (input == 1){
                        house.window2 = "(︡• _⦣•︠)";
                        house.window1 = "︻┳═一**_";
                    } else if (input == 3){
                        house.window2 = "(︡• _⦣•︠)";
                        house.window3 = "︻┳═一**_";
                    }
                } else if (player.currentPosition == 3) {
                    if (input == 3) {
                        house.topOf3 = "︻┳═一** ";
                        house.window3 = "(︡> _⦣<︠)";
                    }
                    else if (input == 2) {
                        house.window3 = "(︡• _⦣•︠)";
                        house.window2 = "︻┳═一**_";
                    }
                    else if (input == 1){
                        house.window3 = "(︡• _⦣•︠)";
                        house.window1 = "︻┳═一**_";
                    }
                }
                System.out.println(house);
                if (input == player.currentPosition) {
                    System.out.println("HIT!!! +25 pts");
                    player.score += 25;
                    player.hits++;
                } else {
                    System.out.println("MISS :(");
                    player.lives--;
                }
                if (player.lives == 0 || player.hits == 3)
                    break;
                house.reset();
            }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\n");
            if (player.hits >= 3) {
                System.out.println("Target Eliminated, you WIN!!!  +200 pts");
                player.score += 200;
                if(player.currentPosition == 1){
                    house.reset();
                    house.window1 = "(︡╥ _⦣╥︠)";
                }
                 else if(player.currentPosition == 2){
                    house.reset();
                    house.window2 = "(︡╥ _⦣╥︠)";
                }
                else if(player.currentPosition == 3){
                    house.reset();
                    house.window3 = "(︡╥ _⦣╥︠)";
                }

            } else {
                System.out.println("Game Over");
                house.reset();
                house.window2 = "(︡• \uD83D\uDC45•︠).";
            }

            System.out.println(house);
            System.out.println("Final Score: " + player.score);
        }
    }

