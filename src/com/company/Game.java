package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Game {

    private String name;
    private String dueDate;
    private Scanner scanner = new Scanner(System.in);
    LocalDate today = LocalDate.now();
    LocalDate threeDaysLater = today.plus(3, ChronoUnit.DAYS);

    public Game(String name) {
        this.name = name;
        dueDate = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        scanner.nextLine();
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        float p2 = ChronoUnit.DAYS.between(today, threeDaysLater);
    }
}
