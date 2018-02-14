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
        System.out.println("What game would you like to remove?");

        for (int i = 0; i < l.size(); i++)
            System.out.println(l.get(i));


    }

    protected void checkoutGame(int gameIndex) {
        System.out.println("What game would you like to check out today?");

        gameIndex -= gameIndex;

        Game game = l.get(gameIndex);

        l.add(game);

        Calendar calendar = Calendar.getInstance();
        System.out.println("You checked out this game on " +
                dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println("It is due back on: " + dateFormat.format(calendar.getTime()));
        game.setDueDate(dateFormat.format(calendar.getTime()));

        l.remove(gameIndex);
        menu.Options();

    }

    protected void checkinGame() {
        System.out.println("What game would you like to check in?");
        System.out.println(l);

        try {
            System.out.println(input.nextInt());
            switch (input.nextInt()) {
                case 1:

            }

        } catch (InputMismatchException ime) {
            System.out.println("Please input a number");
            checkinGame();
        }
        menu.Options();


    }

    protected void listGames(int code) {
        int index = 1;

        System.out.println("This is your list of games :D");

        for (Game game : l) {
            System.out.println(index++ + ". " + game.getName());
        }
        if (l.equals("Checked out")) ;
        {
            System.out.println("This game has been checked out");

            menu.Options();
        }


    }

    protected void checkedOut() {
        System.out.println("Here is a list of the games you have checked out :D");


    }
}


