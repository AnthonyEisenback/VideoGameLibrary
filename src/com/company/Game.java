package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    private String name;
    private String dueDate;

    /**Nice job */
    public Game(String name) {
        this.name = name;
        dueDate = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
      getDueDate();
    }
}
