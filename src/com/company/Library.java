package com.company;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Library {
    ArrayList<Game> l = new ArrayList<>();
    ArrayList<String> games = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");


    protected void addGame(Game game) {
        Library library2 = new Library();

//        System.out.println("You have come here to add a game to your library. Please enter the games name now.");
        String inputUsed = input.nextLine();
        l.add(game);
        System.out.println("Your game has been saved!");
        Menu menu = new Menu();
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
        Menu menu = new Menu();
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
        Menu menu = new Menu();
        menu.Options();


    }

    protected void listGames(int code) {
        int index = 1;

        System.out.println("This is your list of games :D");

        for (Game game : l) {
            System.out.println(l);
                System.out.println(index++ + ". " + game.getName());
            }
            if (l.equals("Checked out")) ;
            {
                System.out.println("This game has been checked out");
                Menu menu = new Menu();
                menu.Options();
            }


        }
    }


