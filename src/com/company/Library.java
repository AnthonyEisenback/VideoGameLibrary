package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {
    Scanner scanner = new Scanner(System.in);
    Menu option = new Menu();


    Game game = new Game("");
    private String[] array = {};


    protected void addGame(Game game) {
        System.out.println(game.getName());
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

    protected void checkout() {


    }

    protected void viewLibrary() {


    }

    protected void checkin() {


    }


    protected void viewCheckedOut() {


    }

}
