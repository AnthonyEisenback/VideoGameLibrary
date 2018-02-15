package com.company;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Library {
    public final Menu menu;
    ArrayList<Game> l = new ArrayList<>();
    ArrayList<String> games = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
    private Game myGames = new Game("");


    public Library(Menu menu) {
        this.menu = menu;
    }


    protected void addGame() {
        System.out.println("You have come here to add a game to your library. Please enter the games name now.");
        String name = input.nextLine();
        Game video = new Game(name);
        l.add(video);
        System.out.println("Your game has been saved!");


        menu.Options();

    }

    protected void removeGame() {
        int index = 1;

        for (Game game : l) {
            System.out.println(index++ + ". " + game.getName());
        }

        System.out.println("What game would you like to remove?");
        String rGame = input.nextLine();
        l.remove(rGame);
        System.out.println("Your game has been removed!");

            menu.Options();
        }

    protected void checkoutGame(int gameIndex) {
        System.out.println("What game would you like to check out today?");

        int index = 1;

        for (Game game : l) {
            System.out.println(index++ + ". " + game.getName());
        }

        System.out.println("please enter the name of the game for checkout!");
        String nameToCheckOut = input.nextLine();
        System.out.println(nameToCheckOut);

        try {
            System.out.println("Is this game " + nameToCheckOut + " the game you would like to checkout?");
            System.out.println("Yes or No? \n1.) Yes \n2.) No ");
            switch (input.nextInt()) {

                case 1:
                    System.out.println("Your game has been checked out!");
                    games.add(nameToCheckOut);
                    l.remove(nameToCheckOut);

                    break;

                case 2:
                    System.out.println("Oh...\n" +
                            "Lets try that again...");
                    checkedOut();
                    break;

                default:
                    System.out.println(" Please select a number! ");
                    checkoutGame(gameIndex);
                    break;


            }

        } catch (InputMismatchException ime) {
            System.out.println("Please select yes or no");
        }


        gameIndex -= gameIndex;

        Game game = l.get(gameIndex);

        l.remove(game);

        Calendar calendar = Calendar.getInstance();
        System.out.println("You checked out this game on " +
                dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println("It is due back on: " + dateFormat.format(calendar.getTime()));
        game.setDueDate(dateFormat.format(calendar.getTime()));


        menu.Options();

    }

    protected void checkinGame() {
        System.out.println("What game would you like to check in?");

        int index = 1;
        for (Game game : l) {
            System.out.println(index++ + ". " + game.getName());

        }
        System.out.println("Please type the name of the game to check it in");

        switch (input.nextInt()) {

            case 1:
                System.out.println("Your game has been checked In!");
                menu.Options();
                break;

            case 2:
                System.out.println("Oh...\n" +
                        "Lets try that again...");
                checkinGame();
                break;

            default:
                System.out.println(" Please select a number! ");

                break;

        }


    }

    protected void listGames(int code) {
        int index = 1;

        System.out.println("This is your list of games :D");

        for (Game game : l) {
            System.out.println(index++ + ". " + game.getName());
        }
        if (l.equals("Checked out")) ;

        menu.Options();
    }

    protected void checkedOut() {
        System.out.println("Here is a list of the games you have checked out :D");

        int index = 1;

        for (String game : games) {
            System.out.println(index++ + ". " + game);
        }

        menu.Options();


    }

    protected void time() {


        Calendar calendar = Calendar.getInstance();
        System.out.println("You checked out this game on " +
                dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println("It is due back on: " + dateFormat.format(calendar.getTime()));
        myGames.setDueDate(dateFormat.format(calendar.getTime()));


        menu.Options();
    }
}


