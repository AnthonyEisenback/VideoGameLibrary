package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

public class Library {
    private Menu menu = new Menu();
    List<Game> arrayList = new ArrayList<>();

    public Game game;

    protected void addGame (Game game) {
        Library library2 = new Library();

        System.out.println("You have come here to add a game to your library. Please enter the games name now.");

        library2.arrayList.add(game);



    }
    protected void removeGame(int gameIndex) {
        Library library3 = new Library();

        gameIndex -= gameIndex;
        arrayList.remove(gameIndex);
        System.out.println("Your game has been removed from your library!");
        menu.Options();

    }

}