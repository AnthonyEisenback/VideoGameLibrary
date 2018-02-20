package com.company;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Library {
    private Scanner input = new Scanner(System.in);
    public final Menu menu;
    ArrayList<Game> l = new ArrayList<>();
    ArrayList<Integer> games = new ArrayList<Integer>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
    private Game myGames = new Game("");
    private String name;


    public Library(Menu menu) {
        this.menu = menu;
    }


    protected void addGame() {


        try {
            System.out.println("Please enter the name of the game you are adding!");
            name = input.nextLine();
            Game video = new Game(name);
            l.add(video);
            System.out.println("Your game has been saved!");


            menu.Options();

        } catch (InputMismatchException ime) {
            System.out.println("Please enter a name");
        }
    }

    protected void removeGame(int gameIndex) {
        int index = 1;
        System.out.println("Input the number of the game to be removed!");

        for (Game game : l) {
            System.out.println(index++ + ". " + game.getName());
        }
//        String scanner = input.nextLine();

        gameIndex--;
        int qwerty = input.nextInt();
        l.remove(qwerty - 1);
        System.out.println("Your game has been removed from your library!");
        menu.Options();
    }


    protected void checkoutGame(int num) {
        int index = 1;
        for (Game game : l) {
            System.out.println(index++ + ". " + game.getName());
        }

        System.out.println("What game would you like to check out today?");


        num -= num;

        Game game = l.get(input.nextInt()-1);

        games.add(input.nextInt()-1);

        Calendar calendar = Calendar.getInstance();
        System.out.println("You checked out this game on " +
                dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println("It is due back on: " + dateFormat.format(calendar.getTime()));
        game.setDueDate(dateFormat.format(calendar.getTime()));

        l.remove(num);
        menu.Options();

    }

    protected void checkinGame() {
        System.out.println("What game would you like to check in?");

        int index = 1;
        for (Game game : l) {
            System.out.println(index++ + ". " + game.getName());

        }

        try {
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
        } catch (InputMismatchException ime) {
            System.out.println("Please input a number!");

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

        menu.Options();
    }

    protected void checkedOut() {
        System.out.println("Here is a list of the games you have checked out :D");

        int index = 1;

        for (Integer game : games) {
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


