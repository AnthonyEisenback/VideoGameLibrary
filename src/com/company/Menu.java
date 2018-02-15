package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Scanner input = new Scanner(System.in);
    public Library library = new Library(this);
    private Menu menu;

    public void Options() {
        System.out.println("Welcome to the video game library, ");
        System.out.println("What would you like to do today?");
        System.out.println("1.) Add a game to your library \n" +
                "2.) Remove a game from your library \n" +
                "3.) Check out a game from your library\n" +
                "4.) View your library \n" +
                "5.) Check in a game \n" +
                "6.) view checked out games \n" +
                "7.) Exit the Program");

        try {
            switch (input.nextInt()) {
                case 1://1.) Add a game to your library
                    library.addGame();


                    break;

                case 2://2.) Remove a game from your library
                    library.removeGame();

                    break;
                case 3://3.) Check out a game from your library
                    library.checkoutGame(0);


                    break;
                case 4://4.) View your library
                    library.listGames(0);


                    break;
                case 5://5.) Check in a game
                    library.checkinGame();

                    break;
                case 6://6.) view checked out games
                    library.checkedOut();

                    break;
                case 7://7.) Exit the Program

                    System.out.println("Goodbye User");
                    System.exit(0);

                    break;
                default:
                    System.out.println("Please enter a number");
                    Options();
                    break;
            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please select a number");
            Options();

        }
    }
}
