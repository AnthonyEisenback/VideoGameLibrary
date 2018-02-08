package com.company;


import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {
    Scanner scanner = new Scanner(System.in);
    Menu option = new Menu();

    protected void addGame() {
        Game game = new Game("");
        System.out.println("What is the name of your game you are adding?");

        System.out.println("You game has been saved!");


    }

    protected void removeGame() {
        System.out.println("What game would you like to remove?");
        try {

            switch (scanner.nextInt()) {
                case 1:
                    //game
                    return;
                case 2:
                    //game
                    return;
                case 3:
                    //game
                    return;
                case 4:
                    //game
                    return;
                default:
                    return;
            }
        } catch (InputMismatchException zxd) {
            scanner.nextLine();
            System.out.println("Please enter a number!");
            removeGame();
        }
    }
}
