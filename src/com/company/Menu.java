package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
   private Scanner input = new Scanner(System.in);

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


                        break;

                    case 2://2.) Remove a game from your library


                        break;
                    case 3://3.) Check out a game from your library


                        break;
                    case 4://4.) View your library

                        break;
                    case 5://5.) Check in a game


                        break;
                    case 6://6.) view checked out games


                        break;
                    case 7://7.) Exit the Program

                        System.out.println("Goodbye User");
                        System.exit(0);

                        break;
                    default:
                        break;
                }

            } catch (InputMismatchException ime) {
                input.nextLine();
                System.out.println("Please select a number");
                Options();

            }
        }
    }
